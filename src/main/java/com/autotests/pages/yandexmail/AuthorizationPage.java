package com.autotests.pages.yandexmail;

import com.autotests.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.autotests.constants.Constant.LogAndPass.LOGIN;
import static com.autotests.constants.Constant.LogAndPass.PASSWORD;

public class AuthorizationPage extends BasePage {

    @FindBy (xpath = "//*[@id='passp-field-login']")
    WebElement loginButton;

    @FindBy (xpath = "//*[@id='passp:sign-in']")
    WebElement enterButton;

    @FindBy (xpath = "//*[@id='passp-field-passwd']")
    WebElement passwordButton;

    public AuthorizationPage authorization() {
        customSendKey(loginButton, LOGIN);
        customClick(enterButton);
        customSendKey(passwordButton, PASSWORD);

        return this;
    }
}
