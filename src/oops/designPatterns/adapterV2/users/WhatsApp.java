package oops.designPatterns.adapterV2.users;

public class WhatsApp {
    private long userNumber;
    private String firstName;
    private String lastName;
    private String email;

    public WhatsApp(String firstName, String lastName, long userNumber, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userNumber=userNumber;
        this.email=email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserNumber(long userNumber) {
        this.userNumber = userNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getUserNumber() {
        return userNumber;
    }

    public String getEmail() {
        return email;
    }
}
