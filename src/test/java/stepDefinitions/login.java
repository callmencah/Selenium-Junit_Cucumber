package stepDefinitions;

import config.env;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import objectRepository.pageLogin;


public class login extends env {


    pageLogin elementLogin = new pageLogin();

    @Given("user is on SauceDemo homepage")
    public void user_is_on_sauce_demo_homepage() {
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnlogin()));
    }

    @When("user input (.*) as username$")
    public void user_input_username(String username) {
        WebElement email = driver.findElement(elementLogin.getField_username());
        email.sendKeys(username);

    }

    @When("user input (.*) as password$")
    public void user_input_password(String password) {
        WebElement field_password = driver.findElement(elementLogin.getField_password());
        field_password.sendKeys(password);
    }

    @When("user click enter")
    public void user_click_enter() {
        WebElement login = driver.findElement(elementLogin.getBtnlogin());
        login.click();
    }

    @Then("user verify (.*) login result$")
    public void user_verify_success_login_result(String status) {
        if (status.contains("success")) {
            new WebDriverWait(driver, Duration.ofSeconds(1))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='header_secondary_container']/span[@class='title']"))
                    );
        } else {
            driver.findElement(By.className("error-button"));
        }
    }
    @Then("user verify failed login")
    public void user_verify_failed_login() {
        driver.findElement(By.className("error-button"));
    }
}