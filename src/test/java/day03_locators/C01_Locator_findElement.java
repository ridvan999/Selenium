package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {
    public static void main(String[] args) throws InterruptedException {
        // amazon anasayfaya git
        // arama kutusuna nutella yaz
        // enter tusuna basarak arama yap
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com/");
        /*
        test otomasyonu yaparken bir web elementi kullanmak
        istersek 2 seye ihtiyac var
        1- webelementi benzersiz olarak tarif edecegimiz locator
        2- bu locatoru soyledigimizde bize web elementi bulup getirecek method

        ornegin amazon sitesindeki arama kutusunun unique tarif edicisi olarak
        id= "twotabsearchtextbox" kullanabiliriz */
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        // data turu   objenin adi        =      findElement : webelementi bulan method
        //                                      By : webelementi bulacagimiz locator'in turunu yazdigimiz method
        //                                      twotabsearchtextbox : unique tarif icin id attribute degeri
        aramaKutusuElementi.sendKeys("Nutella");// Nutella yazdi
        aramaKutusuElementi.submit();// arama kutusuna enter yapti

        Thread.sleep(5000);
        driver.close();
    }
}
