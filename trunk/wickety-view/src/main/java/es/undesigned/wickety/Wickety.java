package es.undesigned.wickety;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Created by Luis Soares (luizsoarez@gmail.com).
 * Date: 3/Mai/2009
 * Time: 17:12:08
 */
public class Wickety extends WebApplication {


    @Override
    protected void init() {
        addComponentInstantiationListener(new SpringComponentInjector(this));
    }

    @Override
    public Class getHomePage() {
        return Login.class;
    }


}
