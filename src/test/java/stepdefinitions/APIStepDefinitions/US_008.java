package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.pojos.US_08_PatientPojo;
import utilities.pojos.US_08_Pojo;

import java.util.HashMap;
import java.util.Map;

import static base_URL.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_008 {

    Response response;
    US_08_PatientPojo patient = new US_08_PatientPojo("ShiningPatient", "Team","2568898123", "shiningpatient@gmail.com"  );
    US_08_Pojo patientPojo = new US_08_Pojo(5182, patient);
    @Given("user sends GET request for the appointment")
    public void user_sends_get_request_for_the_appointment() {

        spec.pathParams("first", "api", "second", "appointments", "third", "5182");

        response = given().
                headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                        "Content-Type", ContentType.JSON).
                spec(spec).
                contentType(ContentType.JSON).
                get("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("user validates the appointment")
    public void user_validates_the_appointment() {

        assertEquals(200, response.getStatusCode());

        Map<String, Object> actualData = response.as(HashMap.class);

        assertEquals(patientPojo.getPatientPojo().getFirstName(), ((Map)actualData.get("patient")).get("firstName"));
        assertEquals(patientPojo.getPatientPojo().getLastName(), ((Map)actualData.get("patient")).get("lastName"));
        assertEquals(patientPojo.getPatientPojo().getEmail(), ((Map)actualData.get("patient")).get("email"));
        assertEquals(patientPojo.getPatientPojo().getPhone(), ((Map)actualData.get("patient")).get("phone"));

    }
}
