package RESTASSUREDBASICS;

import org.testng.annotations.Test;

import groovy.util.logging.Log;

import java.util.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


//given - all input details(add auth, add param, content type, set header))
//when - submit the API - resource, http method
//Then - Validate the response


public class HttpRequests {
	/*
	RestAssured="https://rahulshettyacademy.com";
	
	
	
	
	
	/*int id;
	@Test(priority=1)
	void getUsers() {
		
		given()
		
		.when()
		   .get("http://localhost:3000/students")
		
		.then()
		   .statusCode(200)
		   .log().all();	
	}
	    
	
	@Test(priority=2)
	void createUser()
	{
		
		HashMap data = new HashMap();
		data.put("name", "Ram");
		data.put("job", "trainer");
		
		
		
		id=given()  //preRequisite //content type:application   //request payload
		 .contentType("application/json")
		 .body(data)
		
		.when()  //http methods
		  .post("http://localhost:3000/students")
		  .jsonPath().getInt("id");
		  		  
	/*	.then()  //validations
		   .statusCode(201)
		   .log().all();
		    	
		  
		  
	}
	
	@Test(priority=3, dependsOnMethods= {"createUser"})  // if create user is passed then only update user execute other wise it will skip
	void updateUser() {

		HashMap data = new HashMap();
		data.put("name", "Anggt");
		data.put("job", "experince");
		
		
		
		 given()    //preRequisite //content type:application   //request payload
		   .contentType("application/json")
		   .body(data)
		
		.when()  //http methods
		   .put("http://localhost:3000/students/"+id)
		  
		.then()
		   .statusCode(200)
		   .log().all();
		
	}
	
	@Test(priority=4)
	void deleteUser() 
	{
		given()
		.when()
		  .delete("http://localhost:3000/students/" +id)
		.then()
		   .statusCode(200)
		   .log().all();
		
	}
*/
}
