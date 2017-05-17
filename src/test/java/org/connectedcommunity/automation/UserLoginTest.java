package org.connectedcommunity.automation;

import org.connectedcommunity.automation.core.WebDriverTestBase;
import org.connectedcommunity.automation.pages.HomePageUserNotLoggedIn;
import org.connectedcommunity.automation.pages.LoginWindowPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by user on 17.05.17.
 */

@Title("User login test")
@Description("Testing login to the system user with valid email and password")
public class UserLoginTest extends WebDriverTestBase {

    private String apllicationURL = "https://automation.connectedcommunity.org/home";
    private String userLogin = "qa@higherlogic.test";
    private String password = "qa";

    public void testUserLoginWithValidInput(){
        HomePageUserNotLoggedIn homePageUserNotLoggedIn= new HomePageUserNotLoggedIn(driver);
        homePageUserNotLoggedIn.openURL(apllicationURL);
        homePageUserNotLoggedIn.openLoginWindow();

        LoginWindowPage loginWindowPage = new LoginWindowPage(driver);


    }
}
