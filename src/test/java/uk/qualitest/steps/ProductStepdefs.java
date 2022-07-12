package uk.qualitest.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.qualitest.pages.CartPage;
import uk.qualitest.pages.HomePage;

public class ProductStepdefs {
    @Given("^I am on homePage$")
    public void iAmOnHomePage() {
    }

    @When("^I add four random items in my card$")
    public void iAddFourRandomItemsInMyCard() {
        new HomePage().clickOnFirstProduct();
        new HomePage().clickOnSecondProduct();
        new HomePage().clickOnThirdProduct();
        new HomePage().clickOnForthProduct();
    }

    @And("^I click on view products$")
    public void iClickInViewProducts() {
        new HomePage().clickViewProductButton();
    }

    @Then("^I verify that all four product successfully added in card$")
    public void iVerifyThatAllFourProductSuccessfullyAddedInCard() {
        int expectedNumberOfProduct = 4;
        Assert.assertEquals("No match Found", expectedNumberOfProduct, new CartPage().verifyFourProductAddedInCard());
    }

    @When("^I search for lowest price item$")
    public void iSearchForLowestItem() {
    }

    @And("^I remove lowest price item from the list$")
    public void iRemoveLowestPriceItemFromTheList() {
        new CartPage().removeLowestProductItem();
    }

    @Then("^I verify that all Three product successfully added in card$")
    public void iVerifyThatAllThreeProductSuccessfullyAddedInCard() throws InterruptedException {
        Thread.sleep(2000);
        int expectedNumOfProducts = 3;
        Assert.assertEquals("No match Found", expectedNumOfProducts, new CartPage().verifyThreeProductAddedInCard());

    }
}
