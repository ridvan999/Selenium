package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        // sisteme webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunu soyler
        WebDriver driver= new ChromeDriver();
        //bilgisayarımızdaki chrome browser in otomasyonla çalışacak bir kopyasını oluşturur.
        // Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        // System.setProperty("webdriver.safari.driver", "safari driver'in dosya yolu")
        // Oluşturdugumuz driver objesi bizim elimiz, gozumuz gibidir
       driver.get("https://www.amazon.com/");// istenen urle e goturur // www yazmasak da olur. https zorunlu

        //System.out.println(driver.getTitle());
        Thread.sleep(5000);
        // driver.close();
         //driver.getCurrentUrl();
        //System.out.println(driver.getPageSource());
        //driver.close();
        System.out.println(driver.getWindowHandle());//6F982D2F17A6C0AFB1A03DF060B143C0
        // girilen urlnin hash codu, her run ettigimizde yeni bir unique code verir


    }
}
