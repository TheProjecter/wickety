package es.undesigned.wickety;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Created by Luis Soares (luizsoarez@gmail.com).
 * Date: 3/Mai/2009
 * Time: 17:12:08
 * <p/>
 * This is the actual web application class, like a wrapper for all the web pages the site has.
 */
public class Wickety extends WebApplication {


    /**
     * To allow for automatic Spring support.
     */
    @Override
    protected void init() {
        addComponentInstantiationListener(new SpringComponentInjector(this));
    }

    /**
     * Self explanatory... tells Wicket which of our pages is the *home* page.
     *
     * @return the class of the home page
     */
    @Override
    public Class getHomePage() {
        return Index.class;
    }


}
