package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;


public class US_002 {
    Response response;
    @Given("user sends GET request for accounts")
    public void user_sends_get_request_for_accounts() {
        response = ApiUtils.getRequest(Authentication.generateToken("AdminTeam01","Team01+"), ConfigReader.getProperty("registration_endpoint_get"));
        response.prettyPrint();
    }
    @Then("user validates username and email address")
    public void user_validates_username_and_email_address() {
        response.then().assertThat().body("login",hasItems("mervemermer"), "email", hasItems("mervemermer@gmail.com"));

    }
    @Then("user validate that the username is unique")
    public void user_validate_that_the_username_is_unique() {
        JsonPath json = response.jsonPath();
        List<String> usernameList = json.getList("login");
        int count = 0;
        for (String w : usernameList) {
            if (w.equals("mervemermer")) {
                count++;
            }
        }
        Assert.assertTrue(count==1);

        if (count == 1) {
            System.out.println(" 'mervemermer' is unique in the list.");
        } else {
            System.out.println(" 'mervemermer' is not unique in the list.");
        }
    }



}
