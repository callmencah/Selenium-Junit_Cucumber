package sauceTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class filterProductZtoA {
    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // --------------------------------------------------------------------------
        driver.get("https://saucedemo.com");
        // --------------------------------------------------------------------------
        WebElement email = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        email.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        System.out.println("Signed in with Standar User Successfully ");
        // --------------------------------------------------------------------------
        WebElement ZtoA = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        ZtoA.click();
        System.out.println("Successfully Filter Name (Z To A )");
    }
}
