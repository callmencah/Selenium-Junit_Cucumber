package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {
    By field_username = By.id("user-name");
    By field_password = By.id("password");

    By btnlogin = By.id("login-button");
    By cekshowelement = By.xpath("//span[@class='title'][contains(text(),'Products')]");




    public By getField_username(){
        return field_username;
    }
    public By getField_password(){
        return field_password;
    }

    public By getBtnlogin() {
        return btnlogin;
    }

    public By getCekshowelement() {
        return cekshowelement;
    }
}
