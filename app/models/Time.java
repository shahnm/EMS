package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class Time extends Model {

	@Required
	public Time time;
	
	public Date date;
	
	public Date capturedDate;
	
	@Required
    @ManyToOne
    public User staff;
    
    @Required
    @ManyToOne
    public Duty duty;
	    
    public Time (Time time, User staff, Duty duty) {
        this.time = time;
        this.staff = staff;
        this.duty = duty;
    }

}