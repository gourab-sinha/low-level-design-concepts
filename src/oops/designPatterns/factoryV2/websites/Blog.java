package oops.designPatterns.factoryV2.websites;

import oops.designPatterns.factoryV2.pages.AboutPage;
import oops.designPatterns.factoryV2.pages.ContactPage;
import oops.designPatterns.factoryV2.pages.PostPage;

public class Blog extends Website {
    @Override
    public void buildWebSite() {
        pages.add(new ContactPage());
        pages.add(new AboutPage());
        pages.add(new PostPage());
    }
}
