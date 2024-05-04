package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BaseClass{

    public LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//h2[text()=\'Test login\']")
    WebElement CheckLoginText;

    @FindBy(id="username")
    WebElement textUserName;

    @FindBy(id="password")
    WebElement textPassword;

    @FindBy(xpath="//h1[contains(text(),'Logged In Successfully')]")
    WebElement checkHomePage;

    @FindBy(id="submit")
    WebElement buttonSubmit;

    private CommonFunction objCommon = new CommonFunction();
    public void checkLoginPage (){
        objCommon.waitForElement(driver,CheckLoginText);
    System.out.println("Hello");
    Assert.assertTrue(CheckLoginText.isDisplayed());
}

public void enterUserName(String userName) {

    textUserName.sendKeys(userName);

}
    public void enterPassword(String password) {

        textPassword.sendKeys(password);
    }

    public void clickSubmitButton() {

        buttonSubmit.click();
        objCommon.waitForElement(driver,checkHomePage);
         Assert.assertTrue(checkHomePage.isDisplayed());

    }


}
