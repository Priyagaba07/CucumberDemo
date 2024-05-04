package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BaseClass;
import pages.LoginPage;

import java.util.List;


public class LoginSteps extends BaseClass {
private LoginPage objLoginPage;

 @Before
 public void setup(){
     driver = new ChromeDriver();
     driver.get("https://practicetestautomation.com/practice-test-login/");
     driver.manage().window().maximize();
 }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        objLoginPage = new LoginPage(driver);
        objLoginPage.checkLoginPage();
    }
    @When("User enters {string} as UserName and {string} as Password")
    public void user_enters_as_user_name_and_as_password(String userName, String password) {
        objLoginPage.enterUserName(userName);
        objLoginPage.enterPassword(password);
    }

    @When("User clicked on Submit Button")
    public void user_clicked_on_submit_button() {
        objLoginPage.clickSubmitButton();
    }

    @Then("User is landed to the homepage")
    public void user_is_landed_to_the_homepage() {

    }

    @When("User enters UserName and Password")
    public void user_enters_user_name_and_password(DataTable usercredentials) {
        List<List<String>> data = usercredentials.asLists();
        driver.findElement(By.id("log")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
        throw new PendingException();
    }
    @After
    public void cleanUp(){
        driver.quit();
    }

}
