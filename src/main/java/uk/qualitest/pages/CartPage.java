package uk.qualitest.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.qualitest.utility.Utility;

import java.util.List;

public class CartPage extends Utility {
    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@class='remove']")
    List<WebElement> listOfProduct;

    @CacheLookup
    @FindBy(xpath = "(//a[@aria-label='Remove this item'][normalize-space()='×'])[4]")
    WebElement removeLowestProduct;

    @CacheLookup
    @FindBy(partialLinkText = "×")
    List<WebElement> finalListOfProduct;

    public int verifyFourProductAddedInCard() {
        log.info("Verify Four product added to the cart : " + listOfProduct.toString());
        return listOfProduct.size();
    }

    public void removeLowestProductItem(){
        clickOnElement(removeLowestProduct);
        log.info("Remove lowest product items : " + removeLowestProduct.toString());
    }


    public int verifyThreeProductAddedInCard() {
       log.info("Verify Three product added to the cart : " + finalListOfProduct.toString());
        return finalListOfProduct.size();
    }
}
