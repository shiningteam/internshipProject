package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import java.util.List;

public class US_002 {
    US_029 us_029 = new US_029();
    List<String> columnList = null;

    @Then("verify contains {string}")
    public void verify_contains(String data) {
            if (columnList != null && columnList.contains(data)) {
                Assert.assertTrue(us_029.columnList.contains(data));
            }
    }
}
