package controllers;

public class Security extends Secure.Security {
    static boolean authenticate(String username,String password){
        if (username.equals("aaa")&& password.equals("123"))
            return true;
        else
            return false;
    }
}
