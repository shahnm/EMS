package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Qualification extends Model {

	@Required
	public String qualificationName;
	
	public String collegeName;
	
	public Integer yearAwarded;
	
	@Required
    @ManyToOne
    public User staff;
	    
    public Qualification(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    public String toString() {
        return qualificationName;
    }
 
}