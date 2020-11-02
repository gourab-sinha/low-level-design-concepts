package oops.designPatterns.factoryV2.pages;

public class SearchPage extends Page {
    private String productName;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
