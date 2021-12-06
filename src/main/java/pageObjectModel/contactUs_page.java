package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BenimDriverim;

public class contactUs_page extends abstractClass{
    WebDriver driver; //yine webdriver oluşturduk çünkü burda da kullanıcaz.

    public contactUs_page(){
        driver=BenimDriverim.getDriver(); //utilities içinde ki ana driver'ıma bağladım
        PageFactory.initElements(driver,this); //findby findall gibi taglerin anahtar kelimesi bu
                                                    //bunu yazmazsak kesinlikle çalışmazlar

    }
        @FindBy(xpath = "//a[@title='Contact Us']")
        //xpath mi css mi vs hangi metodala bulduğumuzu yazıyoruz.
            private WebElement contactUsButton; //contactus'ı buldum web elemente eşitledim.
                                                //neden private çünkü bunu da bir metodla çağıracam.
                                                //şöyle çağırıyorum..
            public void clickContactUsButton(){
            //nasıl tıklatıcam? abstarct'a yazdıgımız click fonksiyonunu cağırarak.
            clickFonksiyon(contactUsButton); //neye tıklatmak istiyorsak parametreyi verdik.

            //en son olarakta clickContactUsButton fonksiyonunu Given(contactUs'ta çağırmam lazım

        }
        @FindBy(name = "id_contact")
            private WebElement subjectHeadingDropdown;

            public void selectHeadingDropdown(){
                //abstrack clasında select için ne create ettin?
            selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
                //hangi açılır menüden seçiceksem onu parametre olarak veriyorum.
                // Ve o acılır menüden ne seciceksem string olarak onu yazıyorum.
            }

            @FindBy(id = "email")

                private WebElement emailTextArea;
                public void typeEmail(){
                    sendKeysFonksiyon(emailTextArea,"croselegolas@gmail.com");
                }

            @FindBy(name = "id_order")
                private WebElement order;
                public void typeOrderReference(){
                    sendKeysFonksiyon(order,"123gonderdik");
                }
             @FindBy(id = "message")
                private WebElement messageBox;
                public void typeMessage(){
                    sendKeysFonksiyon(messageBox,"test dogru calısıyor");
                }

            @FindBy(id = "submitMessage")
                private WebElement sendButton;
                public void clickOnSendButton(){
                    clickFonksiyon(sendButton);
                }

            @FindBy(css = "p.alert.alert-success")
                private WebElement successMessege;
                public void assertMyMessege(){

                    Assertion(successMessege,"Your message has been successfully sent to our team.");

                }
}

