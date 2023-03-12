package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.util.List;
import static org.junit.Assert.assertTrue;

public class US_008 {

    List<Object> columnList;

    @Then("verify countryId contains {int}")
    public void verify_country_id_contains(Integer id) {
        assertTrue(columnList.contains(id));
    }

}
