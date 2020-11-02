package oops.designPatterns.factoryV2.websites;

import oops.designPatterns.factoryV2.pages.AboutPage;
import oops.designPatterns.factoryV2.pages.ContactPage;
import oops.designPatterns.factoryV2.pages.ProductPage;
import oops.designPatterns.factoryV2.pages.SearchPage;

public class ECommerce extends Website{
    @Override
    public void buildWebSite() {
        pages.add(new ProductPage());
        pages.add((new SearchPage()));
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
