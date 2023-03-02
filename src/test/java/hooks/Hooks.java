package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static baseurl.MedunnaBaseUrl.medunnaSetUp;

public class Hooks {
    @Before
    public void setUpScenario(){
    }
    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()){//capturing the screenshot when a sceraio fails and attaching it to the report
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName()+"");
            Driver.closeDriver();
        }
    }

    @Before("@smoke_tests")
    public void setUpSmokeScenarios(){
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }

    @After("@smoke_tests")
    public void tearDownSmokeScenarios(){
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }

    @Before("@TC08_Api_Test")
    public void beforeApi(){
        medunnaSetUp();
    }

}
