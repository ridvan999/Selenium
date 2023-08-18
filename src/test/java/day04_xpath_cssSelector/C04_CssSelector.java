package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*  1- bir class olusturun
            2- https://www.amazon.com/ adresine gidin
            3- Browseri tam sayfa yapin
            4- Sayfayi “refresh” yapin
            5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
            6- Gift Cards sekmesine basin
            7- Birthday butonuna basin
            8- Best Seller bolumunden ilk urunu tiklayin
            9- Gift card details’den 25 $’i secin
            10-Urun ucretinin 25$ oldugunu test edin
            11-Sayfayi kapatin    */
        driver.get("https://www.amazon.com.tr/");
       // 4
            driver.findElement(By.id("nav-logo-sprites"));
       // 5
            String expectedIcerik = "bilgisayar";
            String actualIcerik= driver.getTitle();
        if (actualIcerik.contains(expectedIcerik)) {
            System.out.println("icerik testi Passed");
        }
        else {
            System.out.println("icerik testi Failed");
        }
        Thread.sleep(3000);
        // 6 cerezleri kabul et
        driver.findElement(By.id("sp-cc-accept")).click();
        Thread.sleep(3000);
       // 7 hediye fikirlerine tıkla
       // driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]")).click();
        // 8 bebek bolumune gir
        driver.findElement(By.xpath("(//*[@overflow='break-word'])[7]")).click();







        Thread.sleep(3000);
        driver.close();
    }
}
