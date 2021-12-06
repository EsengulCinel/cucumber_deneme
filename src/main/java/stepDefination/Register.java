package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModel.register_page;
import utilities.BenimDriverim;

import java.util.concurrent.TimeUnit;

public class Register {
    private WebDriver driver;

    register_page register_page=new register_page();  //Register.java

    @Given("^Navigate to Website$")
    public void navigate_to_website() throws Throwable {
        driver= BenimDriverim.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
