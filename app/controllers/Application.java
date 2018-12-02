package controllers;

import models.User;
import play.*;
import play.mvc.*;

import java.util.*;

//import models.*;

public class Application extends Controller {

    public static void index() {
        new User("123@qq.com","123456","adbdef").save();
        User bob = User.find("byEmail","123@qq.com").first();
        System.out.println(bob.email);
        System.out.println(bob.fullname);
        render();
    }
    public static void hello(){
        render();
    }

}