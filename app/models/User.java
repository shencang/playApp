package models;
import play.db.jpa.Model;

import java.util.*;
import javax.persistence.Entity;

@Entity
public class User extends Model {
    public String email;
    public String passawd;
    public String fullname;
    public boolean isAdmin;

    public User( String email , String passawd, String fullname){
        this.email=email;
        this.passawd= passawd;
        this.fullname=fullname;
    }
}
