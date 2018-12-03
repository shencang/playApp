package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import java.util.Date;

@Entity
public class Post extends Model {

    public String title;
    @Lob
    public String content;
    public Date postedAt;


    public Post(String title,String content){
        this.title =title;
        this.content =content;
        this.postedAt = new Date();
    }



}
