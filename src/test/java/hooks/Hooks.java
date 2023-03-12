package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static baseurl.MedunnaBaseUrl.medunnaSetUp;
import static utilities.JSUtils.clickElementByJS;

public class Hooks {
    @Before
    public void setUpScenario(){
    }
//    @After
//    public void tearDownScenario(@NotNull Scenario scenario){
//
//        if (scenario.isFailed()){//capturing the screenshot when a sceraio fails and attaching it to the report
//            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName()+"");
//
//        }
//        Driver.closeDriver();
//    }

    @Before("@smoke_tests")
    public void setUpSmokeScenarios(){
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }

    @After("@smoke_tests")
    public void tearDownSmokeScenarios(){
        System.out.println("RUN FOR ONLY SMOKE TEST SCENARIOS");
    }

    @Before("@US029_DeleteRequest")
    public void beforeApi(){
        medunnaSetUp();
    }


}
