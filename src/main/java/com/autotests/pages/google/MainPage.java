package com.autotests.pages.google;

import com.autotests.pages.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.autotests.constants.Constant.CoffeeMachine.COFFEE_MACHINE;

public class MainPage extends BasePage {

    @FindBy (xpath = "//input[@aria-label=\"Найти\"]")
    WebElement findButton;

    @FindBy (xpath = "//*[@id='result-stats']")
    WebElement resultFind;

    @FindBy (xpath = "//*[contains(text(),'М.Видео')]")
    WebElement mVideo;

    public MainPage findCoffeeMachine(){

        findButton.sendKeys(COFFEE_MACHINE, Keys.ENTER);
        equals(resultFind);
        Assert.assertNotNull(mVideo);


        return this;
    }
}
