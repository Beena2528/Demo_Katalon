package uk.qualitest.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.qualitest.utility.Utility;

import java.util.List;

import static uk.qualitest.drivermanager.ManageDriver.driver;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='site-viewport']/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/div[2]/ul[1]/li[1]/div[1]/a[2]")
    WebElement productOne;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='site-viewport']/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/div[2]/ul[1]/li[2]/div[1]/a[2]")
    WebElement productTwo;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='site-viewport']/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/div[2]/ul[1]/li[7]/div[1]/a[2]")
    WebElement productThird;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='site-viewport']/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/div[2]/ul[1]/li[6]/div[1]/a[2]")
    WebElement productForth;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='site-viewport']/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/div[2]/ul[1]/li[6]/div[1]/a[3]")
    WebElement viewCard;


    public void clickOnFirstProduct() {
        mouseHoverToElementAndClick(productOne);
        log.info("Click On First Product : " + productOne.toString());
    }
    public void clickOnSecondProduct() {
        mouseHoverToElementAndClick(productTwo);
        log.info("Click On Second Product : " + productTwo.toString());
    }
    public void clickOnThirdProduct() {
        mouseHoverToElementAndClick(productThird);
        log.info("Click On Third Product : " + productThird.toString());
    }
    public void clickOnForthProduct() {
        mouseHoverToElementAndClick(productForth);
        log.info("Click On Forth Product : " + productForth.toString());
    }
    public void clickViewProductButton() {
        mouseHoverToElementAndClick(viewCard);
        log.info("Clicking on view product button : " + viewCard.toString());
    }


}
