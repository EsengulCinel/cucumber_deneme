package stepDefination;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjectModel.register_page;
import utilities.BenimDriverim;

import java.util.concurrent.TimeUnit;

public class Register {


    register_page register_page=new register_page();  //Register.java
    private WebDriver driver;
    @Given("^Navigate to Website$")
    public void navigate_to_website() throws Throwable {
        driver= BenimDriverim.getDriver();
        BenimDriverim.getDriver().manage().window().maximize();
        BenimDriverim.getDriver().get("http://automationpractice.com/index.php");
        BenimDriverim.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed() == !true) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        }
        BenimDriverim.quitDriver();
    }
    @And("^click sign in button$")
    public void clickSignInButton() {
        register_page.clickOnSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        register_page.typeEmail(email);
  }

    @And("^click on create an account button$")
    public void clickOnCreateAnAccountButton() {
        register_page.clickOnSubmitButton();
    }

    @Then("^exit browser$")
    public void exitingBrowser() {
        browserUtil.clickOnSubmitButton();
    }
    @And("^choose tittle$")
    public void chooseTittle() {
        register_page.selectGender();
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        register_page.typeFirstnameAndLastname(firstname,lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
        register_page.typePassword(password);
    }



    @And("^type company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable {
        register_page.typeCompany(company);

    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address1) throws Throwable {
        register_page.typeaddress1(address1);

    }
    @After
    public void quitDriver() throws InterruptedException { //register.java
        Thread.sleep(2000);
        driver.close();
    }
}
