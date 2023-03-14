package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_016 {
    List<Object> firstnameList;
    @Given("User\\(admin) connects to database")
    public void user_admin_connects_to_database() {
        DBUtils.createConnection();
    }
    @When("Get all {string} as a list from {string}")
    public void get_all_as_a_list_from(String columnName, String tableName) {
        String query="Select first_name from patient";
        firstnameList= DBUtils.getColumnData(query, columnName);
        System.out.println(firstnameList);
    }
    @Then("Verify patientsList contains patients  created by adminteam01")
    public void verify_patients_list_contains_patients_created_by_adminteam01() {
        assertTrue(firstnameList.contains("Hank"));
    }
    @Then("Close the connection")
    public void close_the_connection() {
    DBUtils.closeConnection();
    }


}
