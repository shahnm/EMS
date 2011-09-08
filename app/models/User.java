package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class User extends Model {

    @Email
    @Required
    public String email;
    @Required
    public String password;
    public String firstName;
    public String lastName;
    public Date DOB;
    public boolean isAdmin;
    
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public User(String email, String password, String firstName, String lastName, Date DOB) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }
    
    public static User connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }

    public String toString() {
        return firstName + " " + lastName;
    }
 
}