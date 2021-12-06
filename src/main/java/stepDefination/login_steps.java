package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;

public class login_steps {

    @Given("Amazon sitesine git")
    public void amazon_sitesine_git() throws Throwable {
        System.out.println("siteye gitti");
    }
    @Given("logine tıkla")
    public void logine_tıkla() throws Throwable {
        System.out.println("login yaptı");
    }
    @Given("isim gir")
    public void isim_gir() throws Throwable {
        System.out.println("isim girdi");

    }
    @Given("sifre gir")
    public void sifre_gir() throws Throwable {
        System.out.println("sifre girdi");

    }
    @When("submite tıkladığımda")
    public void submite_tıkladığımda() throws Throwable {
        System.out.println("submite tıkladı");

    }
    @Then("success mesajını verify et")
    public void success_mesajını_verify_et() throws Throwable {
        System.out.println("verify etti");

    }

}
