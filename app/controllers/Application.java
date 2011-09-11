package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void home() {
    	if(Security.check("admin")){
		    Admin.index();
	    } else {
	    	Application.index();
	    }
    }
    
}