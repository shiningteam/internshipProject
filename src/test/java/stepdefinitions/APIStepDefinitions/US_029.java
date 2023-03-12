package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static utilities.Authentication.generateToken;

public class US_029 {

    @Given("user sends POST request for the create a new country")
    public void user_sends_post_request_for_the_create_a_new_country() {
        spec.pathParams("first", "api", "second", "countries");

    }
    @Then("user validates the creation of country")
    public void user_validates_the_creation_of_country() {

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("name", "Greece");

        Response response = given().
                spec(spec).
                headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                        "Content-Type", ContentType.JSON).
                contentType(ContentType.JSON).
                body(expectedData).
                when().
                post("/{first}/{second}");

        response.prettyPrint();

        Map<String, Object> actualData = response.as(HashMap.class);
        System.out.println("actualData: " + actualData);

        assertEquals(201, response.statusCode());
        assertEquals(expectedData.get("name"), actualData.get("name"));

    }

    @Given("user sends GET request for the read new country")
    public void user_sends_get_request_for_the_read_new_country() {
        spec.pathParams("first", "api", "second", "countries", "third", "20181");
    }
    @Then("user validates the read of country")
    public void user_validates_the_read_of_country() {

        Response response = given().
                spec(spec).
                headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                        "Content-Type", ContentType.JSON).
                when().
                get("/{first}/{second}/{third}");
        response.prettyPrint();

        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json").
                body("id",equalTo(20181)).
                body("name",equalTo("Greece"));
    }

    @Given("user sends PUT request for the update the new country name")
    public void user_sends_put_request_for_the_update_the_new_country_name() {
        spec.pathParams("first", "api", "second", "countries");
    }
    @Then("user validates the update of country")
    public void user_validates_the_update_of_country() {
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("id", 20181);
        expectedData.put("name", "Spain");

        Response response = given().
                spec(spec).
                headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                        "Content-Type", ContentType.JSON).
                contentType(ContentType.JSON).
                body(expectedData).
                when().
                put("/{first}/{second}");

        response.prettyPrint();

        Map<String, Object> actualData = response.as(HashMap.class);
        System.out.println("actualData: " + actualData);

        assertEquals(200, response.statusCode());
        assertEquals(expectedData.get("name"), actualData.get("name"));
    }

    @Given("user sends DELETE request for the update the new country name")
    public void user_sends_delete_request_for_the_update_the_new_country_name() {
        spec.pathParams("first", "api", "second", "countries", "third", "20181");

    }
    @Then("user validates the delete of country")
    public void user_validates_the_delete_of_country() {
        Response response = given().spec(spec).headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                "Content-Type", ContentType.JSON).when().delete("/{first}/{second}/{third}");
        response.prettyPrint();

        Map<String, Object> expectedData = new HashMap<>();
        System.out.println(expectedData);

        Map<String, Object> actualData = response.as(HashMap.class);
        System.out.println(actualData);

        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData, actualData);
        //or
        assertEquals(expectedData.size(), actualData.size());
        //or
        assertTrue(actualData.isEmpty());

    }

}
