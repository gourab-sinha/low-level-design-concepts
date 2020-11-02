package oops.designPatterns.adapterV2.userAdapter;

import oops.designPatterns.adapterV2.users.User;
import oops.designPatterns.adapterV2.users.WhatsApp;

public class WhatsAppUser implements User {
    private WhatsApp user;
    public WhatsAppUser(WhatsApp user){
        this.user = user;
    }
    @Override
    public String getUserId() {
        return user.getUserNumber()+"";
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
        return user.getEmail();
    }
}
