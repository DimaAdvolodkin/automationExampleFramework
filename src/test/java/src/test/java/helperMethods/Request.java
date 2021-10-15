package src.test.java.helperMethods;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Request {

    String googleBaseUrl = "https://www.google.com";

     public Response sendGoogleRequest(String searchString) {
         Response response = RestAssured.given().log().all().baseUri(googleBaseUrl)
                 .queryParam("q", searchString)
                 .get("/search");
         return response;
     }

}
