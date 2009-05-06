package es.undesigned.wickety;

import es.undesigned.wickety.lib.LocalLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;


/**
 * Created by Luis Soares (luis.soares@tomtom.com).
 * Date: 5/Mai/2009
 * Time: 22:19:02
 * <p/>
 * The home page of wickety. This page will actually display all the several pages available
 * in the application, as an index for all the stuff I've learned.
 */
public class Index extends WebPage {

    public Index() {
        // configure the several components

        // H1 title in the page
        Label indexLabel = new Label("indexTitle", "Welcome to Wickety");

        // a link to the wickety web page
        ExternalLink wicketyLink = new ExternalLink("linkToWickety", "http://code.google.com/p/wickety/");
        wicketyLink.add(new Label("wicketyLinkDescription", "here"));

        // a link to external links
        LocalLink externalLinksLink = new LocalLink(
                "linkToLinks", new PersonalLinks(),
                new Label("linksText", "External personal links"));

        // do the final additions to the page
        add(indexLabel);
        add(wicketyLink);
        add(externalLinksLink);
    }
}
