package es.undesigned;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.model.Model;
import es.undesigned.services.BandService;
import es.undesigned.services.Band;

import java.util.List;

/**
 * Created by Luis Soares (luis.soares@tomtom.com).
 * Date: 3/Mai/2009
 * Time: 17:07:01
 */
public class Login extends WebPage {
    private TextField userIdField;
    private PasswordTextField passField;
    private Form form;

    @SpringBean
    private BandService bandService;

    public Login() {
        userIdField = new TextField("userId", new Model(""));
        passField = new PasswordTextField("password", new Model(""));
        passField.setResetPassword(false);

        form = new LoginForm("loginForm");
        form.add(userIdField);
        form.add(passField);
        add(form);
    }

    private class LoginForm extends Form {
        public LoginForm(String id) {
            super(id);
        }

        @Override
        protected void onSubmit() {
            String userId = Login.this.getUserId();
            String password = Login.this.getPassword();

            System.out.println("you entered " + userId + " and " + password);

            List<Band> bandList = bandService.readAllBands();
            for (Band band : bandList) {
                System.out.println(band.toString());
            }
        }
    }

    private String getUserId() {
        return userIdField.getModelObjectAsString();
    }

    private String getPassword() {
        return passField.getModelObjectAsString();
    }
}