package AppStepDefination;

import Core.AppHelper;
import SearchPage.LoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;


public class LoginStepDefination {
   public static AndroidDriver driver;
    LoginPage alp;

    @Given("user in the page")
    public void userInThePage() throws MalformedURLException, InterruptedException {
        AppHelper ahp = new AppHelper();
        driver = ahp.appAutomation();
    }
    @When("user enter {string} and {string}")
    public void userEnterUsernameAndPassword(String username, String password) throws InterruptedException {
        alp = new LoginPage(driver);
        alp.userInformation(username, password);
    }

    @And("click login button")
    public void clickLoginButton() throws InterruptedException {
        alp.clickLogin();
    }

    @Then("successfully open home page")
    public void successfullyOpenHomePage() throws InterruptedException {
        alp.getText();
    }

}

