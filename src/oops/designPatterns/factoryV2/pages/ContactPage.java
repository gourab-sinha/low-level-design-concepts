package oops.designPatterns.factoryV2.pages;

public class ContactPage extends Page{
    private String email;
    private String contactNo;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }
}
