package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BenimDriverim {


    private static WebDriver driver;  //driver'im create edildi.
                                      //kullanımda hali hazirda bir driver'im
                                      // yoksa daha teste başlamadıysam bana şu metodu getir diyorum
    public static WebDriver getDriver(){
        if (driver==null) { //yani şuan da çalışan bir driver'im yoksa  normal yolunu yaz
            System.setProperty("webdriver.chrome.driver","C:\\Users\\amdocsecinel\\Desktop\\selenium_test\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
   }
    private static void closeDriver(){  //driver'ım doluysa çalışan varsa
        if(driver!=null){
            driver.quit();              //driver'i kapat
            driver=null;           // ben tekrar run işleminde sistem
                                 // getDrivar'a gelsin driver'ı sıfır görsün devam etsin

        }
    }
}
