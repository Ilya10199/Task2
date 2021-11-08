package test.cases;


import org.testng.annotations.Test;
import test.base.BaseTest;

import static com.autotests.constants.Constant.Urls.GOOGLE;
import static com.autotests.constants.Constant.Urls.YANDEX_MAIL;
import static io.qameta.allure.Allure.step;

public class TestCases extends BaseTest {

    @Test
    public void testCaseOne(){
        getPageManager().getBasePage().open(YANDEX_MAIL);
        step("Авторизация. Яндекс почта", () -> getPageManager().getAuthorizationPage().authorization());
    }

    @Test
    public void testCaseTwo(){
        getPageManager().getBasePage().open(GOOGLE);
        step("Ищем кофе машину", () -> getPageManager().getMainPage().findCoffeeMachine());
    }
}
