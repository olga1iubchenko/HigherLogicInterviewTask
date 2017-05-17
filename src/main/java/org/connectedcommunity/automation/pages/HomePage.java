package org.connectedcommunity.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 17.05.17.
 */
public class HomePage extends AbstractPage{

    @FindBy(how = How.ID, using = "Welcome_LoginLink")
    WebElement signInButton;

    public HomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginWindow openLoginWindow(){
        signInButton.click();
        return new LoginWindow(driver);
    }

}
