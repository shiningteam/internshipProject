package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_018 {

    List<Object> columnList;


    @When("get all {string} as a testlist from {string}")
    public void getAllAsATestlistFrom(String columnName, String tableName) {
            String query = "SELECT * FROM " + tableName;
            columnList = DBUtils.getColumnData(query, columnName);
            System.out.println("columnList = " + columnList);
        }

    @Then("verify testNameList contains {string}")
    public void verifyTestNameListContains(String testNameList) {
        assertTrue(columnList.contains(testNameList));

    }


    @When("get all {string} as a Idlist from {string}")
    public void getAllAsAIdlistFrom(String columnName, String tableName) {
        String query = "SELECT * FROM " + tableName;
        columnList = DBUtils.getColumnData(query, columnName);
        System.out.println("columnList = " + columnList);
    }


    @Then("verify Idlist contains {string}")
    public void verifyIdlistContains(String testId) {

        assertTrue(columnList.toString().contains(String.valueOf(testId)));

    }


}
