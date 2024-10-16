package RESTASSUREDBASICS;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.*;
//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Files.Payloads;
import Files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class HttpMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		/* given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json")
		    .body(Payloads.AddPlace())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		    .header("server","Apache/2.4.52 (Ubuntu)"); */
		 
		 String response=given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json")
		    .body(Payloads.AddPlace())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		    .header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		 
		 System.out.println(response);
		 JsonPath js=new JsonPath(response); // Json path will convert string into Json format
		 //js.getString("place_id");
		 String placeId=js.getString("place_id");
		 System.out.println(placeId);
		 
		 
		 //Add palce  -> Update the place with new Address ->Get place to validate if new address is present in response
		 
       //update the address
		 String newAddress="70 Summer walk, USA";
		 
		 given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json")
		    .body("{\r\n"
		    		+ "\"place_id\":\""+placeId+"\",\r\n"  
		    		+ "\"address\":\"70 Summer walk, USA\",\r\n"
		    		+ "\"key\":\"qaclick123\"\r\n"
		    		+ "}").
		  when().put("/maps/api/place/update/json")  
		  .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		 
		//get new address
		 
		 String getPlaceResponse=given().log().all().queryParam("key", "qaclick123")
		  .queryParam("place_id", placeId).
		 when().get("/maps/api/place/get/json")
		 .then().log().all().assertThat().statusCode(200).extract().response().asString();
		 
		 //JsonPath js1=new JsonPath(getPlaceResponse);
		 JsonPath js1=ReusableMethods.rawToJson(getPlaceResponse);
		 String actualAddress = js1.getString("address");
		 System.out.println(actualAddress);
		 Assert.assertEquals(actualAddress, newAddress);
	}

}
