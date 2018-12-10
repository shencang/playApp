package controllers;

import models.User;
import play.*;
import play.mvc.*;

import java.util.*;

//import models.*;

public class Application extends Controller {

    public static void index() {
        User u1 =new User("123@qq.com","123456","adbdef").save();
        User u2 =new User("1@qq.com","12345678","jinhaojinhao").save();

        u1.isAdmin=false;
        u2.isAdmin=true;
        render();
    }
    public static void hello(){
        render();
    }

}