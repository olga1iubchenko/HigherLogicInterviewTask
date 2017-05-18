package org.connectedcommunity.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by user on 17.05.17.
 */
public class LoginWindowPage extends AbstractPage{

    @FindBy(how = How.ID, using = "MainCopy_Login1_UserLogin")
    WebElement emailAddressField;

    @FindBy(how = How.ID, using = "MainCopy_Login1_UserPass")
    WebElement passwordField;


    @FindBy(how = How.ID, using = "MainCopy_Login1_ForgotPassword")
    WebElement forgotPasswordLink;

    @FindBy(how = How.ID, using = "MainCopy_Login1_Remember")
    WebElement rememberMeCheckBox;

    @FindBy(how = How.ID, using = "MainCopy_Login1_LoginButton")
    WebElement loginButton;


    public LoginWindowPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Fill Email Address with valid email")
    public void fillEmailAddressField(String email){
        webDriverUtils.waitForExpectedCondition(
                ExpectedConditions.visibilityOf(emailAddressField));
        emailAddressField.sendKeys(email);
    }

    @Step("Fill Password with valid input")
    public void fillPasswordFiled(String password){
        passwordField.sendKeys(password);
    }


    @Step("Click on \"Forgot Password?\" link")
    public void clickOnForgotParrwordLink(){
        forgotPasswordLink.click();
    }

    @Step("Set \"Remember Me\" check box")
    public void setRememberMeCheckBox(){
        rememberMeCheckBox.click();
    }

    @Step("Click on Login button")
    public void clickOnLoginButton(){
        loginButton.click();
    }

}
