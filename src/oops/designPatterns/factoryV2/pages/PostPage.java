package oops.designPatterns.factoryV2.pages;

public class PostPage extends Page{
    private String content;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
