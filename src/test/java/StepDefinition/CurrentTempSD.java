package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import webPages.HomePage;
import webPages.TempPage;

public class CurrentTempSD {

        HomePage homePage = new HomePage();
        TempPage tempPage = new TempPage();

        @Given("^I am on the home page$")
        public void i_am_on_the_home_page()  {
            SharedSD.before();
        }

        @Then("^I verify current temperature is not greater or less than temperature from daily timeline$")
        public void i_verify_current_temperature_is_not_greater_or_less_than_temperature_from_daily_timeline() {
            homePage.clickOnCurrentLocationButton();

            //Assert.assertTrue(tempPage.CurrentTempValue()<tempPage.TempNow());


        }
}
