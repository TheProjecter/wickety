package es.undesigned.wickety;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.link.Link;


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
        Label wicketyLinkDescription = new Label("wicketyLinkDescription", "here");
        ExternalLink wicketyLink = new ExternalLink("linkToWickety", "http://code.google.com/p/wickety/");
        wicketyLink.add(wicketyLinkDescription);

        // a link to external links
//        Label externalLinkDescription = new Label("linksText", "External personal links");
        WicketyLink externalLinksLink = new WicketyLink(
                new PersonalLinks(),
                "linkToLinks",
                new Label("linksText", "External personal links"));
//        externalLinksLink.add(externalLinkDescription);


        // do the final additions to the page
        add(indexLabel);
        add(wicketyLink);
        add(externalLinksLink);
    }


    /**
     * A link to a org.apache.wicket.markup.html.WebPage
     */
    private class WicketyLink extends Link {
        private WebPage page;

        /**
         * Creates a Wickety Link.
         *
         * @param webPage    the org.apache.wicket.markup.html.WebPage to where this Link is going to point
         * @param identifier the markup identifier if this link
         * @param label      the label for this link
         */
        public WicketyLink(WebPage webPage, String identifier, Label label) {
            super(identifier);
            page = webPage;
            add(label);
        }

        /**
         * Sets the response page for this link
         */
        @Override
        public void onClick() {
            setResponsePage(page);
        }
    }
}
