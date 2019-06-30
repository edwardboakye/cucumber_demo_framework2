package webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By App = By.xpath("//a[@class='headerAppLink']");
    private By Maps = By.xpath("//a[@href='/maps']");
    private By DarkSkyApi = By.xpath("//div/a[@href='/dev']");
    private By Help = By.xpath("//a[@href='/help/website']");
    private By About = By.xpath("//div/a[@href='/about']");
    private By CurrentLocationButton = By.xpath("//a[@class= 'currentLocationButton']");



    public void clickOnApp() {
        clickOn(App);
    }
    public void clickOnMaps() { clickOn(Maps); }
    public void clickOnDarkSkyApi() {
        clickOn(DarkSkyApi);
    }
    public void clickOnHelp() {
        clickOn(Help);
    }
    public void clickOnAbout() {
        clickOn(About);
    }
    public void clickOnCurrentLocationButton() {
        clickOn(CurrentLocationButton);
    }

}
