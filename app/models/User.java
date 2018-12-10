package models;
        import play.data.validation.*;
        import play.db.jpa.Model;

        import java.util.*;

        import javax.persistence.Entity;

@Entity
public class User extends Model {
    @Email
    @Required
    public String email;

    @Required
    @Password
    @MinSize(8)
    public String passawd;

    @Required
    @MaxSize(64)
    public String fullname;
    public boolean isAdmin;

    public User( String email , String passawd, String fullname){
        this.email=email;
        this.passawd= passawd;
        this.fullname=fullname;
    }

    public static User connect(String email, String passawd) {
        return find("byEmailAndPassawd", email, passawd).first();
    }



    @Override
    public String toString() {
        return fullname;
    }
}
