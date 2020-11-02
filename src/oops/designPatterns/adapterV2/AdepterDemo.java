package oops.designPatterns.adapterV2;

import oops.designPatterns.adapterV2.users.User;

import java.util.List;

public class AdepterDemo {
    public static void main(String[] args){
        List<User> userList = ClientUser.getUsers();
        for(User user: userList){
            System.out.println("----------------------------");
            System.out.println(user.getFirstName());
            System.out.println(user.getLastName());
            System.out.println(user.getEmail());
            System.out.println(user.getUserId());
        }
    }
}
