package controllers;

import models.Post;
import play.mvc.Controller;

import java.util.List;

public class Blog extends Controller {

    public static void index(){
        List<Post>posts = Post.findAll();
        render(posts);
    }

    public static void save(){

    }
    public static void form(){
        render();
    }
}
