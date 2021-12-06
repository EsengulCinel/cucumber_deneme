package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BenimDriverim;

public class register_page extends abstractClass{
    private WebDriver driver;
    public register_page(){  //yapıcı class
        driver= BenimDriverim.getDriver();
        PageFactory.initElements(driver,this);
    }
      @FindBy(css = "a.login")
        private WebElement signinButton;
        public void clickOnSignInButton(){
            clickFonksiyon(signinButton);
        }

      @FindBy(id = "email_create")  //register_page.java
        private WebElement emailTextBox;
        public void typeEmail(String email){
            sendKeysFonksiyon(emailTextBox,email);

        }


      @FindBy(id = "SubmitCreate")
        private WebElement submitButton;
        public void clickOnSubmitButton(){
            clickFonksiyon(submitButton);
        }
      @FindBy(id = "id_gender1")
        private WebElement gender;
        public void selectGender(){
            clickFonksiyon(gender);
        }


    @FindBy(id = "customer_firstname")
        private WebElement customer_firstname;
    @FindBy(id = "customer_lastname")
        private WebElement customer_lastname;
    public void typeFirstnameAndLastname(String firstname,String lastname){
        sendKeysFonksiyon(customer_firstname,firstname);
        sendKeysFonksiyon(customer_lastname,lastname);

    }

    @FindBy(id = "passwd")
    private WebElement typePassword;
    public void typePassword(String password){
        sendKeysFonksiyon(typePassword,password);
    }

    @FindBy(id = "company")
    private WebElement typeCompany;
    public void typeCompany(String company){
        sendKeysFonksiyon(typeCompany,company);

    }
    @FindBy(id = "address1")
    private WebElement typeaddress1;
    public void typeaddress1(String address1){
        sendKeysFonksiyon(typeaddress1,address1);
    }
}
