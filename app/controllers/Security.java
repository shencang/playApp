package controllers;

import models.User;

public class Security extends Secure.Security {
    static boolean authenticate(String username,String passawd){

            return User.connect(username,passawd)!=null;
    }
    public static boolean check(String profile) {
        if(Security.isConnected()){
            if(profile.equals("admin")) {
                String user = Security.connected();
                User u = User.find("byEmail", user).first();
                return u.isAdmin;
            }
            else {
                // 其他角色的判断...
                return true;
            }
        }
        else
            return false;
    }

}
