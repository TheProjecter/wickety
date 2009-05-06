package es.undesigned.wickety.lib;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

/**
 * Created by Luis Soares (luis.soares@tomtom.com).
 * Date: 6/Mai/2009
 * Time: 22:09:45
 * <p/>
 * An easier way to code a Link which points to a local (as in, programmed in this application) page.
 */
public class LocalLink extends Link {
    private WebPage webPage;

    /**
     * Creates a Wickety Link.
     *
     * @param identifier the markup identifier if this link
     * @param webPage    the org.apache.wicket.markup.html.WebPage to where this Link is going to point
     * @param label      the label for this link
     */
    public LocalLink(String identifier, WebPage webPage, Label label) {
        super(identifier);
        this.webPage = webPage;
        add(label);
    }

    @Override
    public void onClick() {
        setResponsePage(webPage);
    }
}
