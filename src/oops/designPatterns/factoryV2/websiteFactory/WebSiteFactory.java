package oops.designPatterns.factoryV2.websiteFactory;

import oops.designPatterns.factoryV2.websites.Blog;
import oops.designPatterns.factoryV2.websites.ECommerce;
import oops.designPatterns.factoryV2.websites.Website;

public class WebSiteFactory {
    public static Website createWebSite(WebsiteType websiteType){
        switch (websiteType){
            case ECommerce:
                return new ECommerce();
            case BLOG:
                return new Blog();
        }
        return null;
    }
}
