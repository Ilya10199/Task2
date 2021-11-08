package com.autotests.utils;

import com.autotests.pages.base.BasePage;
import com.autotests.pages.google.MainPage;
import com.autotests.pages.yandexmail.AuthorizationPage;

public class PageManager {

    private BasePage basePage;
    private MainPage mainPage;
    private AuthorizationPage authorizationPage;

    public BasePage getBasePage(){
        if(basePage == null){
            return basePage = new BasePage();
        }
        return basePage;
    }

    public MainPage getMainPage(){
        if(mainPage == null){
            return mainPage = new MainPage();
        }
        return mainPage;
    }

    public AuthorizationPage getAuthorizationPage(){
        if(authorizationPage == null){
            return authorizationPage = new AuthorizationPage();
        }
        return authorizationPage;
    }
}
