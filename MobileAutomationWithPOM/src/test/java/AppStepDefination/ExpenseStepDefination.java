package AppStepDefination;

import SearchPage.ExpensePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AppStepDefination.LoginStepDefination.driver;

public class ExpenseStepDefination {
    ExpensePage ep;
    @Given("user in expense report page")
    public void userInExpenseReportPage() throws InterruptedException {
        ep = new ExpensePage(driver);
        ep.clickExpense();
    }

    @When("click add button successfully add expense")
    public void clickAddButtonSuccessfullyAddExpense() throws InterruptedException {
        ep.addExpense();
    }

    @And("click back button and go back home page")
    public void clickBackButtonAndGoBackHomePage() throws InterruptedException {
        ep.backButton();
    }

    @Then("click logout")
    public void clickLogout() throws InterruptedException {
        ep.logOut();
    }
}
