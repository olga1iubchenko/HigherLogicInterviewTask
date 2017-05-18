package org.connectedcommunity.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by user on 17.05.17.
 */
public class HomePageUserNotLoggedIn extends AbstractPage{

    @FindBy(how = How.ID, using = "Welcome_LoginLink")
    WebElement signInButton;

    public HomePageUserNotLoggedIn(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Open LoginWindowPage")
    public LoginWindowPage openLoginWindow(){
        signInButton.click();
        return new LoginWindowPage(driver);
    }

    @Step("Get SignIn button")
    public WebElement getSignInButton(){
        return signInButton;
    }

}
