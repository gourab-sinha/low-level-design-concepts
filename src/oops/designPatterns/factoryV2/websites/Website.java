package oops.designPatterns.factoryV2.websites;

import oops.designPatterns.factoryV2.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    List<Page> pages = new ArrayList<Page>();

    public Website(){
        this.buildWebSite();
    }
    public abstract void buildWebSite();

    public List<Page> getPages() {
        return pages;
    }
}
