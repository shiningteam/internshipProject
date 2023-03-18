package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.AssertJUnit;
import pojos.US_18_TestItem;
import java.util.HashMap;
import java.util.Map;
import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static utilities.Authentication.generateToken;

public class US_018 {

    Response response;
    US_18_TestItem us18TestItem;
    static Object testItemId;


    @Given("user sends POST request to create a new test item")
    public void user_sends_post_request_to_create_a_new_test_item() {
        //Set the url
        spec.pathParams("first", "api", "second", "c-test-items");

        //Set the expected data
        us18TestItem = new US_18_TestItem();
        us18TestItem.setName("LDL_A Collestrol2");
        us18TestItem.setDescription("low density lipid");
        us18TestItem.setDefaultValMax("42");
        us18TestItem.setDefaultValMin("66");
        us18TestItem.setPrice(61.0);
    }
    @Then("user gets the data and validates the creation of the test item")
    public void user_gets_the_data_and_validates_the_creation_of_the_test_item() {

        //Send the request
        Response response = given().
                spec(spec).
                headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                        "Content-Type", ContentType.JSON).
                contentType(ContentType.JSON).
                body(us18TestItem).
                when().
                post("/{first}/{second}");

        response.prettyPrint();

        assertEquals(201, response.statusCode());

        Map<String, Object> actualDataMap = response.as(HashMap.class);

        System.out.println("actualDataMap: " + actualDataMap);

        Assert.assertEquals(us18TestItem.getName(), (actualDataMap.get("name")));
        assertEquals(us18TestItem.getDescription(), (actualDataMap.get("description")));
        assertEquals(us18TestItem.getDefaultValMax(), (actualDataMap.get("defaultValMax")));
        assertEquals(us18TestItem.getDefaultValMin(), (actualDataMap.get("defaultValMin")));
        assertEquals(us18TestItem.getPrice(), (actualDataMap.get("price")));

     testItemId = (actualDataMap.get("id"));

    }


//US018_GetRequest

    @Given("user sends GET request to read new test item")
    public void user_sends_get_request_to_read_new_test_item() {
        spec.pathParams("first", "api", "second", "c-test-items","third",testItemId);

        //Set the expected data
        us18TestItem = new US_18_TestItem();
        us18TestItem.setName("LDL_A Collestrol2");
        us18TestItem.setDescription("low density lipid");
        us18TestItem.setDefaultValMax("42");
        us18TestItem.setDefaultValMin("66");
        us18TestItem.setPrice(61.0);
    }

    @Then("user gets the data and validates test item")
    public void user_gets_the_data_and_validates_test_item() {

        //Send the request
        Response response = given().
                spec(spec).
                headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                        "Content-Type", ContentType.JSON).
                contentType(ContentType.JSON).
                when().
                get("/{first}/{second}/{third}");

        response.prettyPrint();

        assertEquals(200, response.statusCode());

        Map<String, Object> actualData = response.as(HashMap.class);

        System.out.println("actualData: " + actualData);

        Assert.assertEquals(us18TestItem.getName(), (actualData.get("name")));
        assertEquals(us18TestItem.getDescription(), (actualData.get("description")));
        assertEquals(us18TestItem.getDefaultValMax(), (actualData.get("defaultValMax")));
        assertEquals(us18TestItem.getDefaultValMin(), (actualData.get("defaultValMin")));
        assertEquals(us18TestItem.getPrice(), (actualData.get("price")));
    }



    @Given("user sends DELETE request to delete  the updated test item")
    public void user_sends_delete_request_to_delete_the_updated_test_item() {
        spec.pathParams("first", "api", "second", "c-test-items","third",testItemId);


    }
    @Then("user validates the deletion of test item")
    public void user_validates_the_deletion_of_test_item() {
        //Set the expected data
        Map<String, Object> expectedData = new HashMap<>();
        System.out.println(expectedData);

        Response response = given().spec(spec).headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                "Content-Type", ContentType.JSON).when().delete("/{first}/{second}/{third}");
        response.prettyPrint();


        RestAssured.defaultParser = Parser.JSON;


        AssertJUnit.assertEquals(204, response.getStatusCode());

        AssertJUnit.assertTrue(response.asString().isEmpty());

    }


    @Given("user sends get request to validate the deleted test item")
    public void user_sends_get_request_to_read_the_deleted_test_item() {
        spec.pathParams("first", "api", "second", "c-test-items","third",testItemId);

        //Set the expected data
        String expectedData = "Not Found";

        Response response = given().spec(spec).headers("Authorization", "Bearer " + generateToken("AdminTeam01", "Team01+"),
                "Content-Type", ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();

        AssertJUnit.assertEquals(404, response.getStatusCode());

        assertEquals(expectedData,response.asString());

    }

}
