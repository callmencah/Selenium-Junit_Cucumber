package objectRepository;
import org.openqa.selenium.By;
public class pageProduct {
    By btn_addcart          = By.id("add-to-cart-sauce-labs-backpack");
    By btn_shoppingcart     = By.id("shopping_cart_container");
    By btn_checkout         = By.id("checkout");
    By btn_firstname        = By.id("first-name");
    By field_lastname       = By.id("last-name");
    By field_postalcode     = By.id("postal-code");
    By btn_continue         = By.id("continue");
    By btn_finish           = By.id("finish");
    By verifycheckoutresult = By.id("checkout_complete_container");

    public By getBtn_addcart() {
        return btn_addcart;
    }

    public By getBtn_shoppingcart() {
        return btn_shoppingcart;
    }

    public By getBtn_checkout() {
        return btn_checkout;
    }

    public By getBtn_firstname() {
        return btn_firstname;
    }

    public By getField_lastname() {
        return field_lastname;
    }

    public By getField_postalcode() {
        return field_postalcode;
    }

    public By getBtn_continue() {
        return btn_continue;
    }

    public By getBtn_finish() {
        return btn_finish;
    }

    public By getVerifycheckoutresult() {
        return verifycheckoutresult;
    }
}
