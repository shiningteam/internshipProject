package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_029 {

    List<Object> columnList;
    @Given("user connects to database")
    public void user_connects_to_database() {
        DBUtils.createConnection();
    }
    @When("get all {string} as a list from {string}")
    public void get_all_as_a_list_from(String columnName, String tableName) {
        String query = "SELECT * FROM " + tableName;
        columnList = DBUtils.getColumnData(query, columnName);
        System.out.println("columnList = " + columnList);

    }

    @Then("verify countryName contains {string}")
    public void verify_country_name_contains(String countryName) {
        assertTrue(columnList.contains(countryName));
    }

    @Then("close the connection")
    public void close_the_connection() {

    }
}
