package AppStepDefination;

import SearchPage.MortgagePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AppStepDefination.LoginStepDefination.driver;

public class MortgageStepDefination {
    MortgagePage mp;
    @Given("user in mortgage request page")
    public void userInMortgageRequestPage() throws InterruptedException {
        mp = new MortgagePage(driver);
        mp.mortgageRequest();
    }

    @When("user enter {string} {string}  {string} {string} and {string}")
    public void userEnterFirstNameLastNameAgeAddressAndAddress(String fn, String ln,String age, String ad1, String ad2) throws InterruptedException {
        mp.mortgageInfo(fn,ln,age,ad1,ad2);
    }

    @And("select country name")
    public void selectCountryName() throws InterruptedException {
        mp.selCountry();
    }

    @And("click next button")
    public void clickNextButton() throws InterruptedException {
        mp.nextButton();
    }

    @And("select type of loan number of years type of occupation and yearly income")
    public void selectTypeOfLoanNumberOfYearsTypeOfOccupationAndYearlyIncome() throws InterruptedException {
        mp.selectOtherInfo();
    }

    @And("click save button")
    public void clickSaveButton() throws InterruptedException {

        mp.saveButton();
    }

    @Then("successfully back to home page")
    public void successfullyBackToHomePage() {

        System.out.println("Sucessfully back to home page");
    }
}
