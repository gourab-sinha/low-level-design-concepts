package oops.designPatterns.adapterV2.userAdapter;

import oops.designPatterns.adapterV2.users.Facebook;
import oops.designPatterns.adapterV2.users.User;

public class FacebookUser implements User {
    private Facebook user;

    public FacebookUser(Facebook user){
        this.user=user;
    }

    @Override
    public String getUserId() {
        return user.getUsername();
    }

    @Override
    public String getFirstName() {
        return user.getFirstName();
    }

    @Override
    public String getLastName() {
        return user.getLastName();
    }

    @Override
    public String getEmail() {
        return user.getEmailId();
    }
}
