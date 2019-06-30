package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import webPages.DarkSkyApiPage;
import webPages.HomePage;
import webPages.SignUpPage;

public class SignUpErrorSD {
    HomePage homePage = new HomePage();
    DarkSkyApiPage darkSkyApiPage = new DarkSkyApiPage();
    SignUpPage signUpPage = new SignUpPage();


    @Given("^I am on the darksky Register page$")
    public void i_am_on_the_darksky_register_page()  {
       homePage.clickOnDarkSkyApi();
       darkSkyApiPage.clickOnSignUp();

    }

    @When("^I click on Register buttom$")
    public void i_click_on_register_buttom()  {
      signUpPage.clickOnRegisterButton();
    }

    @Then("^I verify page title message \"([^\"]*)\"$")
    public void iVerifyPageTitleMessage(String arg1) {
        String expected = SharedSD.getDriver().getTitle();
        String actual = "Dark Sky API: Register";
        Assert.assertEquals(expected, actual);

    }



    }

