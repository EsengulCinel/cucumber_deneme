package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjectModel.contactUs_page;
import utilities.BenimDriverim;

import java.util.concurrent.TimeUnit;


public class contactUs {
    private WebDriver driver;

    contactUs_page contactUs_page=new contactUs_page();

    @Given("^website git$")
    public void website_git() throws Throwable {
        driver= BenimDriverim.getDriver();  //asıl driver'ımı atamam lazım.
                                            // O da nerde BenimDriver'ımın içinde
        //bundan sonra asıl işlemler
        driver.manage().window().maximize();  //sistemi başlat ve büyüt
        driver.get("http://automationpractice.com/index.php");//gitmek istediğim site
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //sayfada ki herhangi
                                                    // bir dolma işlemine dair 20 sn bekleme koyduk
    }
    @Given("^click contactus button$")
    public void click_contactus_button() throws Throwable {

    contactUs_page.clickContactUsButton();
    }

    @Given("^select heading$")
    public void select_heading() throws Throwable {
        contactUs_page.selectHeadingDropdown();

    }

    @Given("^type email$")
    public void type_email() throws Throwable {
        contactUs_page.typeEmail();
    }

    @Given("^type referance$")
    public void type_referance() throws Throwable {
        contactUs_page.typeOrderReference();

    }

    @Given("^type mesaj$")
    public void type_mesaj() throws Throwable {
        contactUs_page.typeMessage();
    }

    @When("^click send button$")
    public void click_send_button() throws Throwable {
        contactUs_page.clickOnSendButton();
    }

    @Then("^verify success mesage$")
    public void verify_success_mesage() throws Throwable {
        Thread.sleep(2000);
        contactUs_page.assertMyMessege();
    }
}
