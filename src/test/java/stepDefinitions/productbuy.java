package stepDefinitions;
import config.env;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepository.pageProduct;
import java.time.Duration;

public class productbuy extends env {

    pageProduct elementProduct = new pageProduct();
    @When("user click  product")
    public void user_click_product() {
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        // --------------------------------------------------------------------------
        WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addtocart.click();
    }
    @When("user click shoping cart")
    public void user_click_shoping_cart() {
        WebElement shoppingcart = driver.findElement(elementProduct.getBtn_shoppingcart());
        shoppingcart.click();
    }
    @When("user click checkout")
    public void user_click_checkout() {
        WebElement checkout = driver.findElement(elementProduct.getBtn_checkout());
        checkout.click();
    }
    @When("user input firstname")
    public void user_input_firstname() {
        WebElement firstname = driver.findElement(elementProduct.getBtn_firstname());
        firstname.sendKeys("Ujang");
    }
    @When("user input lastname")
    public void user_input_lastname() {
        WebElement lastname = driver.findElement(elementProduct.getField_lastname());
        lastname.sendKeys("Lanang");

    }
    @When("user input postal code")
    public void user_input_postal_code() {
        WebElement postalcode = driver.findElement(elementProduct.getField_postalcode());
        postalcode.sendKeys("10420");
    }
    @When("user click continue")
    public void user_click_continue() {
        WebElement btncontinue = driver.findElement(elementProduct.getBtn_continue());
        btncontinue.click();
    }
    @When("user click finish")
    public void user_click_finish() {
        WebElement btnfinish = driver.findElement(elementProduct.getBtn_finish());
        btnfinish.click();
    }
    @Then("user verify success checkout result")
    public void user_verify_success_checkout_result() {
        ExpectedConditions.presenceOfElementLocated(elementProduct.getVerifycheckoutresult());
        System.out.println("checkout Sukses");
    }
}
