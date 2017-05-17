package org.connectedcommunity.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 17.05.17.
 */
public class LoginWindow extends AbstractPage{

    public LoginWindow (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
