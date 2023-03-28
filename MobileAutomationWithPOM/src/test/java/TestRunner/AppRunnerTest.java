package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags = "@test1 or @test2 or @test3 or @test4",
        features = {
                "src/test/resources/Features/appLogin.feature",
                "src/test/resources/Features/appMakePayment.feature",
                "src/test/resources/Features/appMortgage.feature",
                "src/test/resources/Features/expenseReport.feature"},

        glue = {"AppStepDefination"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/appFeature.html"
        })

@Test
public class AppRunnerTest extends AbstractTestNGCucumberTests {


}
