package webPages;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage {
    private By EmailAddress = By.xpath("//input[@type='email']");
    private By Password = By.xpath("//input[@name='password']");
    private By ConfirmPassword = By.xpath("//input[@name='confirmation']");
    private By RegisterButton = By.xpath("//button[@type='submit']");

    public void clickOnEmailAddress() {
        clickOn(EmailAddress);
    }
    public void clickOnPassword() {
        clickOn(Password);
    }
    public void clickOnConfirmPassword() {
        clickOn(ConfirmPassword);
    }
    public void clickOnRegisterButton() {
        clickOn(RegisterButton);
    }

}
