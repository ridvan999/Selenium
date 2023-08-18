package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Category bolumundeki elementleri locate edin
        4- Category bolumunde 3 element oldugunu test edin
                                                    ///// 5- Category isimlerini yazdirin
        6- Sayfayi kapatin  */
        // 2
        driver.get("https://www.automationexercise.com/");
        List <WebElement> categoryElements =driver.findElements(By.className("panel-title"));
        System.out.println(categoryElements);
         int expectedCategory=3;
         int actualCategorysize=categoryElements.size();
         if ( expectedCategory ==  actualCategorysize) {
             System.out.println("element testi Passed");
         }
         else System.out.println("element test Failed");

          /*  System.out.println(categoryElementsList);
            Normalde bir list direk yazdirilabilir
            Ancak findElements() ile bulunan elementler Webelement oldugundan direk YAZDIRILAMAZ
            bir for-each loop kullanilarak listenin elementleri yazdirilabilir
         */
        for (WebElement eachElement: categoryElements
        ) {
            System.out.print(eachElement.getText() +" ");
        }
        driver.close();



    }
}
