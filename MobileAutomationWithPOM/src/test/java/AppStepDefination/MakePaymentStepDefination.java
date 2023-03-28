package AppStepDefination;

import SearchPage.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AppStepDefination.LoginStepDefination.driver;

public class MakePaymentStepDefination{
   // AndroidDriver driver;
    PaymentPage pp;
    @Given("user in the make payment page")
    public void userInTheMakePaymentPage() {
        pp = new PaymentPage(driver);
        pp.paymentClick();
    }

    @When("user enter {string} {string} and {string}")
    public void userEnterPhoneNameAndAmount(String phone, String name, String amount) throws InterruptedException {
        pp.paymentInfo(phone,name,amount);

    }

    @And("select the country name")
    public void selectTheCountryName() throws InterruptedException {
        pp.selectCou();
    }

    @And("click send payment button")
    public void clickSendPaymentButton() throws InterruptedException {
        pp.sendButton();
    }

    @Then("successfully make payment")
    public void successfullyMakePayment() {
        System.out.println("Successfully go to home page");
    }

}
