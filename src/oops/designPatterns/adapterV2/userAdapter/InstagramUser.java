package oops.designPatterns.adapterV2.userAdapter;

import oops.designPatterns.adapterV2.users.Instagram;
import oops.designPatterns.adapterV2.users.User;

public class InstagramUser implements User {
    private Instagram user;

    public InstagramUser(Instagram user){
        this.user=user;
    }

    @Override
    public String getUserId() {
        return user.getUser_handle();
    }

    @Override
    public String getFirstName() {
        return user.getFirst_name();
    }

    @Override
    public String getLastName() {
        return user.getLast_name();
    }

    @Override
    public String getEmail() {
        return user.getEmail_id();
    }
}
