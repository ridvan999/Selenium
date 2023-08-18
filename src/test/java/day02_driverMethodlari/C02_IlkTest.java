package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C02_IlkTest {
    public static void main(String[] args) {
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
      /*  System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com/");
        //4. Sayfa basligini (title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin "Amazon" icerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Amazon kelimesi icerir");
        }
        else {
            System.out.println("Title Amazon kelimesi icermez. Test failed");
        }
        //6. Sayfa adresini (url) yazdirin
        //7. Sayfa url'inin "amazon" icerdigini test edin.
        //8. Sayfa handle degerini yazdirin
        //9. Sayfa HTML kodlarinda "alisveris" kelimesi gectigini test edin
        //10. Sayfayi kapatin.*/



        // 1. Yeni bir package olusturalim : day01
        // 2. Yeni bir class olusturalim : C03_GetMethods
        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        // 4. Sayfa basligini(title) yazdirin
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        // 6. Sayfa adresini(url) yazdirin
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        // 8. Sayfa handle degerini yazdirin
        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        // 10. Sayfayi kapatin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        String expected="Amazon";
        String actual=driver.getTitle();
        if (actual.contains(expected)){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }
        driver.getWindowHandle();
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }
        String expectedHtml="alisveris";
        String actualHtml=driver.getPageSource();
        if (actualHtml.contains(expectedHtml)){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }


    }
}
