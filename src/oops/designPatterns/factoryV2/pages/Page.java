package oops.designPatterns.factoryV2.pages;

public abstract class Page {
    private String title;
    private String body;
    private String footer;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getFooter() {
        return footer;
    }
}
