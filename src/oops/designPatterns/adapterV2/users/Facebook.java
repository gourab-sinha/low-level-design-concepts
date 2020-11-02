package oops.designPatterns.adapterV2.users;

public class Facebook {
    private String username;
    private String firstName;
    private String lastName;
    private String emailId;

    public Facebook(String firstName, String lastName, String username, String emailId){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.username=username;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUsername() {
        return username;
    }
}
