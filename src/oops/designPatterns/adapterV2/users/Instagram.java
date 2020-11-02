package oops.designPatterns.adapterV2.users;

public class Instagram {
    private String user_handle;
    private String first_name;
    private String last_name;
    private String email_id;

    public  Instagram(String first_name, String last_name, String user_handle, String email_id){
        this.first_name=first_name;
        this.last_name=last_name;
        this.user_handle=user_handle;
        this.email_id=email_id;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setUser_handle(String user_handle) {
        this.user_handle = user_handle;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getUser_handle() {
        return user_handle;
    }

}
