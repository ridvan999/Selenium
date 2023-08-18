package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
         Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
         Kodlar calismaya basladiginda biz driver icin yol gostermezsek Selenium kendi driver'ini devreye sokuyor
         Ama baslangicta driver ayari aradigi icin biraz yavas calisiyor*/
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// bir web sayfasını açıncaya ya da aradigimiz elementi
                                                                     // buluncaya kadar driverin bekledigi max sureyi ifade eder
        driver.get("https://amazzon.com");
        System.out.println("baslangicta konum:   "+driver.manage().window().getPosition());//   (9, 9)
        System.out.println("baslangicta boyut:   "+driver.manage().window().getSize());//   (1051, 894)
        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("maximize den sonra konum:   "+driver.manage().window().getPosition());//   (-8, -8)
        System.out.println("maximizeden sonra boyut:   "+driver.manage().window().getSize());//    (1552, 928)
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("fullscreen den sonra konum:   "+driver.manage().window().getPosition());//   (0, 0)
        System.out.println("fullscreenden sonra boyut:   "+driver.manage().window().getSize());//   (1536, 960)
        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("minimize  den sonra konum:   "+driver.manage().window().getPosition());// (9, 9)
        System.out.println("minimize den sonra boyut:   "+driver.manage().window().getSize());//   (1051, 894)
        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(55,60));
        driver.manage().window().setSize(new Dimension(550,500));
        System.out.println("kendi ayarladigimiz konum:   "+driver.manage().window().getPosition());// (9, 9)
        System.out.println("kendi ayarladigimiz boyut:   "+driver.manage().window().getSize());//   (1051, 894)

        Thread.sleep(3000);
        driver.close();

    }
}

