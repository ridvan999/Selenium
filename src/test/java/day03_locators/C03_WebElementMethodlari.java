package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https:/amazon.com/");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
      //  System.out.println(aramaKutusu.isDisplayed());
        aramaKutusu.isEnabled();
        System.out.println(aramaKutusu.getText());






        Thread.sleep(3000);
        driver.close();

    }
}
