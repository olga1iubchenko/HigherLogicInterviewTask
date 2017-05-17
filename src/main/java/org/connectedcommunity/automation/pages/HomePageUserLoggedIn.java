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
public class HomePageUserLoggedIn extends AbstractPage{

        @FindBy(how = How.CSS, using = ".HtmlContent>font>span")
        WebElement qaUserViewLabel;

        @FindBy(how = How.ID, using = "BtnShowProfile")
        WebElement showProfileButton;


        public HomePageUserLoggedIn(WebDriver driver){
            super(driver);
            PageFactory.initElements(driver, this);
        }

        @Step("Get user view label")
        public WebElement getUserViewLabel(){
            return qaUserViewLabel;
        }

        @Step("Click on Show Profile Button")
        public void clickOnShowProfileButton(String email){
            showProfileButton.click();
        }
}
