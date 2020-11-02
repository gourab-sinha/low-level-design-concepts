package oops.designPatterns.adapterV2;

import oops.designPatterns.adapterV2.userAdapter.FacebookUser;
import oops.designPatterns.adapterV2.userAdapter.InstagramUser;
import oops.designPatterns.adapterV2.userAdapter.WhatsAppUser;
import oops.designPatterns.adapterV2.users.Facebook;
import oops.designPatterns.adapterV2.users.Instagram;
import oops.designPatterns.adapterV2.users.User;
import oops.designPatterns.adapterV2.users.WhatsApp;

import java.util.ArrayList;
import java.util.List;

public class ClientUser {
    public static List<User> getUsers(){
        // Facebook User Creation
        Facebook fbUser = new Facebook("Gourab", "Sinha", "gourabsinha", "gourab@gmail.com");

        // Instagram User Creation
        Instagram instaUser = new Instagram("Priyansh", "Dey", "priyansh2012", "priyansh@gmail.com");

        // WhatsApp User Creation
        WhatsApp whatsAppUser = new WhatsApp("Raj", "Sharma", 9877427734L, "raj@gmail.com");

        List<User> userList = new ArrayList<>();
        User user1 = (User)(new FacebookUser(fbUser));
        User user2 = (User)(new InstagramUser(instaUser));
        User user3 = (User)(new WhatsAppUser(whatsAppUser));

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
}
