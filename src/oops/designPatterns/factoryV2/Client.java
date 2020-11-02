package oops.designPatterns.factoryV2;

import oops.designPatterns.factoryV2.websiteFactory.WebSiteFactory;
import oops.designPatterns.factoryV2.websiteFactory.WebsiteType;
import oops.designPatterns.factoryV2.websites.ECommerce;
import oops.designPatterns.factoryV2.websites.Website;

public class Client {
    public static void main(String[] args){
        ECommerce eCommerce = (ECommerce) WebSiteFactory.createWebSite(WebsiteType.ECommerce);
        System.out.print(eCommerce.getPages());
    }
}
