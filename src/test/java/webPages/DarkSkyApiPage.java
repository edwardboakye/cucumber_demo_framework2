package webPages;

import org.openqa.selenium.By;

public class DarkSkyApiPage extends BasePage{

    private By Docs = By.xpath("//li/a[@href= '/dev/docs']");
    private By Faq = By.xpath("//li/a[@href= '/dev/docs/faq']");
    private By LogIn = By.xpath("//a[@href='/dev/login']");
    private By SignUp = By.xpath("//li/a[@href='/dev/register']");


    public void clickOnDocs() {
        clickOn(Docs);
    }
    public void clickOnFaq() {
        clickOn(Faq);
    }
    public void clickOnLogIn() {
        clickOn(LogIn);
    }
    public void clickOnSignUp() {
        clickOn(SignUp);
    }


}
