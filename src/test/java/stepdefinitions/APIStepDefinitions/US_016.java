package stepdefinitions.APIStepDefinitions;

import baseurl.MedunnaBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_016_Pojo;
import pojos.US_016_UserPojo;

import java.util.HashMap;
import java.util.Map;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_016 {
/**
 {
 "createdBy": "system",
 "firstName": "Hank",
 "lastName": "MacGyver",
 "phone": "3443447575",
 "email": "keith.bruen@yahoo.com",
 "user": {
 "login": "system",
 "activated": true,
 "ssn": "856-45-6788"
 }
 }*/
    US_016_UserPojo userPojo=new US_016_UserPojo("system", true, "856-45-6788");
    US_016_Pojo pojo=new US_016_Pojo("Hanks", "MacGyver", "3443447575", "keith.bruen@yahoo.com", userPojo);
    Response response;

    @Given("user sends GET request for created patient")
    public void user_sends_get_request_for_created_patient() {

       spec.pathParams("first", "api","second", "patients");

       response = given().
               headers("Authorization", "Bearer " +generateToken("AdminTeam01", "Team01+"),
                       "Content-Type", ContentType.JSON).
               spec(spec).contentType(ContentType.JSON).
               when().
               get("/{first}/{second}");
       response.prettyPrint();

    }
    @Then("verify the created patient's information")
    public void verify_the_created_patient_s_information() {

        assertEquals(200, response.getStatusCode());
        JsonPath jsonPath=response.jsonPath();
        //assertEquals(pojo.getCreatedBy(), jsonPath.getString("firstname"));
        assertEquals(pojo.getFirstName(), jsonPath.getString("firstname"));
        assertEquals(pojo.getLastName(), jsonPath.getString("lastname"));
        assertEquals(pojo.getPhone(), jsonPath.getInt("phone"));
        assertEquals(pojo.getEmail(), jsonPath.getString("email"));







    }
}

