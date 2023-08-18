package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_AutomationExcercise {
    public static void main(String[] args) {
        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Sayfada 147 adet link bulundugunu test edin.
        4- Products linkine tiklayin
        5- special offer yazisinin gorundugunu test edin
        6- Sayfayi kapatin   */
        //  1 //
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 2 //
        driver.get("https://www.automationexercise.com/");
        // 3 //
        List<WebElement> sayfadakiLinkElementleri=driver.findElements(By.tagName("a"));// *** link arama
        int expectedLinkSayisi=147;
        int actualLinkSayisi=sayfadakiLinkElementleri.size();

        if (expectedLinkSayisi==sayfadakiLinkElementleri.size()) {
            System.out.println("sayfadaki link sayisi PASSED");
        }
        else {
            System.out.println("sayfadaki link sayisi testi FAILED");
        }
        // 4 //
        WebElement productLinkElementi= driver.findElement(By.partialLinkText("Products"));
        productLinkElementi.click();

        // 5 //
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else{
            System.out.println("special offer testi FAILED");
        }





        driver.close();


    }
}
