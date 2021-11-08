package com.autotests.pages.base;

import com.autotests.utils.CustomDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(CustomDriver.getDriver(), this);
    }

    public void open(String url) {
        CustomDriver.getDriver().get(url);
    }


    public void scrollToElement(WebElement xPath){
        waitElementIsVisible(xPath);
        ((JavascriptExecutor)CustomDriver.getDriver()).executeScript("arguments[0].scrollIntoView();", xPath);
    }

    public void customClick (WebElement element){
        scrollToElement(element);
        element.click();
    }

    public void customSendKey (WebElement element, String information){
        scrollToElement(element);
        element.click();
        element.clear();
        element.sendKeys(information);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(CustomDriver.getDriver(), 4 ).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void equals (WebElement xPath) {
        String str = xPath.getText();
        str = str.replaceAll("\\D+","");
        int i = Integer.parseInt(str)/1000;
        Assert.assertTrue(i > 10);
    }
}
