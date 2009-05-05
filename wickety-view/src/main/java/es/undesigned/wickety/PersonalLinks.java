package es.undesigned.wickety;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Soares (luis.soares@tomtom.com).
 * Date: 5/Mai/2009
 * Time: 23:33:16
 */
public class PersonalLinks extends WebPage {

    public PersonalLinks() {
// a hardcoded list of external links
        List<String> links = new ArrayList<String>(3);
        links.add("http://undesigned.es/");
        links.add("http://ilegalmagazine.com/");
        links.add("http://gurbhouse.com/");
        ListView listView = new LinksList("externalLinks", links);


        add(listView);
    }

    /**
     * Private class for the list of links
     */
    private class LinksList extends ListView {

        public LinksList(String s, List list) {
            super(s, list);
        }

        protected void populateItem(ListItem listItem) {
            String url = (String) listItem.getModelObject();

            ExternalLink externalLink = new ExternalLink("externalLink", url);
            externalLink.add(new Label("externalLinkDescription", url));
            listItem.add(externalLink);
        }
    }

}
