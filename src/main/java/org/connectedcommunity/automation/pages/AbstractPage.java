package org.connectedcommunity.automation.pages;

import org.connectedcommunity.automation.util.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by user on 17.05.17.
 */
public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtils webDriverUtils;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(this.driver);
    }

    @Step("Open URL")
    public void openURL(String url) {
        driver.get(url);
    }


    @Step("Send input to depined search field")
    public void enterTextInField(WebElement textField, String input) {
        textField.sendKeys(input);
        textField.submit();
    }

}
