package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import java.util.Date;

@Entity
public class Post extends Model {

    @Required
    public String title;

    @Required
    @Lob
    public String content;
    public Date postedAt;


    public Post(String title,String content){
        this.title =title;
        this.content =content;
        this.postedAt = new Date();
    }



}
