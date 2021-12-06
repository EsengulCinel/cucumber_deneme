package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BenimDriverim;

public abstract class abstractClass {
    private WebDriver driver= BenimDriverim.getDriver();
    WebDriverWait wait=new WebDriverWait(driver,10);

    public void clickFonksiyon(WebElement clickElement){   //suan en genel şeklinde yazıyoruz
                                //tıklayacağımız element bu bi web elemente tıklıyoruz
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
                                    //elementimiz tıklanabilecek hala gelene kadar beklesin

        clickElement.click(); //sonra da normal tıklat.

    }

    public void sendKeysFonksiyon(WebElement sendKeysElement,String value){
         wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
         sendKeysElement.sendKeys(value);
    }




    public void selectElementFromDropdown(WebElement dropdown, String Element){
                                                    //string dedik çünkü visiable text ile secicez.
        Select slc=new Select(dropdown);  //içine hangi dropdown'ı kullanacaksak onu yazıyoruz.
        //burda genel bir kullanım olduğu için dropdown dedik yoksa direkt inspectten alabiliriz.
        slc.selectByVisibleText(Element);
    }


    public void Assertion(WebElement actual,String expected){ //doğrulama için iki şeye ihtiyacım var.
                                                              // Ne umuyorum? ve sistem bana ne veriyor?

     wait.until(ExpectedConditions.visibilityOf(actual));
     Assert.assertEquals(actual.getText(),expected);
        //bu üst satırda ilk önce Assert'ü import ettik. testng'yi yani
        // sonra ekranda aldığım sonucu texte çevirip beklediğim sonuç ile karşılaştır dedim.
     System.out.println("My messege" + actual.getText());

    }
}
