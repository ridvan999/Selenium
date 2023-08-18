package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ZeroWebapp {
    public static void main(String[] args) throws InterruptedException {

          // 1. http://zero.webappsecurity.com sayfasina gidin
          // 2. Signin buttonuna tiklayin
          // 3. Login alanine “username” yazdirin
          // 4. Password alanina “password” yazdirin
          // 5. Sign in buttonuna tiklayin
          // 6. Back tusu ile sayfaya donun
          // 7. Online Banking menusunden Pay Bills sayfasina gidin
          // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
          // 9. tarih kismina “2020-09-10” yazdirin
          // 10. Pay buttonuna tiklayin
          // 11. “The payment was successfully submitted.” mesajinin ciktigini test edin

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(3000);
        // 2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
        Thread.sleep(3000);
        // 3. Login alanine “username” yazdirin
        WebElement loginKutusu= driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");
        Thread.sleep(3000);
        // 4. Password alanina “password” yazdirin
        WebElement passwordKutusu= driver.findElement(By.id("user_password"));
        passwordKutusu.sendKeys("password");
        Thread.sleep(3000);
        //5. Sign in butonuna tıkla
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        // 6. Back tusu ile sayfaya donun
        driver.navigate().back();
        Thread.sleep(3000);
        // 7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("pay_bills_link")).click();
        Thread.sleep(3000);
        // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amount=driver.findElement(By.id("sp_amount"));
        amount.sendKeys("10");
        Thread.sleep(3000);
        // 9. tarih kismina “2020-09-10” yazdirin
        WebElement date=driver.findElement(By.id("sp_date"));
        date.sendKeys("2020-09-10");
        // 10. Pay buttonuna tiklayin
        Thread.sleep(3000);
        driver.findElement(By.id("pay_saved_payees")).click();













    }
}
