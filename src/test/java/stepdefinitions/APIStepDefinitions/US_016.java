package stepdefinitions.APIStepDefinitions;

import baseurl.MedunnaBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_016_Pojo;
import pojos.US_016_UserPojo;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_016 {
    US_016_UserPojo userPojo=new US_016_UserPojo("system", true, "856-45-6788");
    US_016_Pojo pojo=new US_016_Pojo("adminteam01", "ShiningPatient3", "Team", "5555555545", userPojo);
    Response response;

    @Given("user sends POST request for creating patient")
    public void user_sends_post_request_for_creating_patient() {
       spec.pathParams("first", "api","second", "patients");
//        pojo.setFirstName("ShiningPatient4");
//        pojo.setLastName("Team");
//        pojo.setPhone("32165498777");
//        pojo.setCreatedBy("AdminTeam01");

       response = given().
               headers("Authorization", "Bearer " +generateToken("AdminTeam01", "Team01+"),
                       "Content-Type", ContentType.JSON).
               spec(spec).contentType(ContentType.JSON).
               body(pojo).post("/{first}/{second}");
       response.prettyPrint();

    }
    @Then("verify the created patient's information")
    public void verify_the_created_patient_s_information() {
        assertEquals(201, response.getStatusCode());
        //assertEquals();


    }
}
// {
//         "createdBy": "adminteam01",
//         "firstName": "ShiningPatient3",
//         "lastName": "Team",
//         "phone": "5555555545",
//         "user": {
//             "login": "system",
//             "activated": true,
//             "ssn": "856-45-6788"
//         }
//         }
