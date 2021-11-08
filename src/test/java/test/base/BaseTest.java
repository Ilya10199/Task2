package test.base;

import com.autotests.utils.CustomDriver;
import com.autotests.utils.PageManager;
import org.testng.annotations.AfterTest;

public class BaseTest {

    PageManager pageManager;

    protected PageManager getPageManager() {
        if (pageManager == null) {
            return pageManager = new PageManager();
        }
        return pageManager;
    }

    @AfterTest(alwaysRun = true)
    public void close() {
        CustomDriver.getDriver().close();
    }
}
