package stepDefinitions;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

// extends -> inheritance
public class Hooks extends env {

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @After
    public void after() {
        driver.quit();
    }
}