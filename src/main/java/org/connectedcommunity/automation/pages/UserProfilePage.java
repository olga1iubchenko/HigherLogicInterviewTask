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
public class UserProfilePage extends AbstractPage{

    @FindBy(how = How.XPATH, using = ".//*[@id='ProfileContainer']//div[@class='col-md-9 col-sm-9 col-xs-9']/h4[contains(text(),'QA')]")
    WebElement userName;

    @FindBy(how = How.XPATH, using = ".//*[@id='ProfileContainer']//div[@class='col-md-9 col-sm-9 col-xs-9']/div[contains(text(),'qa@higherlogic.test')]")
    WebElement userEmailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='Welcome_Details_CompleteBarProgress_0']/div[@class='progress']")
    WebElement progressBar;

    @FindBy(how = How.ID, using = "Welcome_Details_profileLink1_0")
    WebElement profileDetailsLink;

    @FindBy(how = How.ID, using = "Welcome_Details_communitiesLink_0")
    WebElement communitiesLinkButton;

    @FindBy(how = How.ID, using = "Welcome_Details_MessagesCount_0")
    WebElement inboxMailLinkButton;

    @FindBy(how = How.ID, using = "Welcome_Details_logoutLink_0")
    WebElement logoutButton;

    public UserProfilePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Go to Profile Details")
    public void goToProfileDetailsLink(){
        profileDetailsLink.click();
    }

    @Step("Go to Communities by communitiesLink")
    public void goToCommunitiesLink(){
        communitiesLinkButton.click();
    }

    @Step("Go to Mail Inbox")
    public void goToInboxLink(){
        inboxMailLinkButton.click();
    }

    @Step("User logged out from the system")
    public HomePageUserNotLoggedIn clickOnLogoutButton(){
        logoutButton.click();
        return new HomePageUserNotLoggedIn(driver);
    }

}
