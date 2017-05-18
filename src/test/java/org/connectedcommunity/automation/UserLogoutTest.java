package org.connectedcommunity.automation;

import org.connectedcommunity.automation.core.WebDriverTestBase;
import org.connectedcommunity.automation.pages.HomePageUserLoggedIn;
import org.connectedcommunity.automation.pages.HomePageUserNotLoggedIn;
import org.connectedcommunity.automation.pages.LoginWindowPage;
import org.connectedcommunity.automation.pages.UserProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by user on 17.05.17.
 */

@Title("User logout test")
@Description("Testing user logout")
public class UserLogoutTest extends WebDriverTestBase{
    private  String applicationURL = "https://automation.connectedcommunity.org/home";
    private  String userLogin = "qa@higherlogic.test";
    private  String userPassword = "qa";

    @BeforeMethod
    public void userLogin() {
        HomePageUserNotLoggedIn homePageUserNotLoggedIn= new HomePageUserNotLoggedIn(driver);
        homePageUserNotLoggedIn.openURL(applicationURL);
        homePageUserNotLoggedIn.openLoginWindow();

        LoginWindowPage loginWindowPage = new LoginWindowPage(driver);
        loginWindowPage.fillEmailAddressField(userLogin);
        loginWindowPage.fillPasswordFiled(userPassword);
        loginWindowPage.clickOnLoginButton();
    }

    @Test
    public void testUserLogout(){
        HomePageUserLoggedIn homePageUserLoggedIn = new HomePageUserLoggedIn(driver);
        homePageUserLoggedIn.clickOnShowProfileButton();

        UserProfilePage userProfilePage = new UserProfilePage(driver);
        userProfilePage.clickOnLogoutButton();

        HomePageUserNotLoggedIn homePageUserNotLoggedIn= new HomePageUserNotLoggedIn(driver);

        Assert.assertTrue(homePageUserNotLoggedIn.getSignInButton().isDisplayed());
    }

}
