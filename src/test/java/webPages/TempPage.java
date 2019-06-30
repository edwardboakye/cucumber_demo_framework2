package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.id;

public class TempPage extends BasePage{
    private By CurrentTempValue = By.xpath("//span[@class='summary swap']");
    private By TempNow = By.xpath("//*[@id=timeline]/div/div[4]/span[1]/span");
    private By TwelveAm = By.xpath("///*[@id=timeline]/div/div[4]/span[2]/span");
    private By TwoAm = By.xpath("//*[@id=timeline]/div/div[4]/span[3]/span");
    private By FourAm = By.xpath("//*[@id=timeline]/div/div[4]/span[4]/span");
    private By SixAm = By.xpath("//*[@id=timeline]/div/div[4]/span[5]/span");
    private By EightAm = By.xpath("//*[@id=timeline]/div/div[4]/span[6]/span");
    private By TenAm = By.xpath("//*[@id=timeline]/div/div[4]/span[7]/span");
    private By TwelvePm = By.xpath("//*[@id=timeline]/div/div[4]/span[8]/span");
    private By TwoPm = By.xpath("//*[@id=timeline]/div/div[4]/span[9]/span");
    private By FourPm = By.xpath("//*[@id=timeline]/div/div[4]/span[10]/span");
    private By SixPm = By.xpath("//*[@id=timeline]/div/div[4]/span[11]/span");
    private By EightPm = By.xpath("//*[@id=timeline]/div/div[4]/span[12]/span");


//    List<WebElement> tempsInTimeLine = driver.findElements(By.cssSelector(".temps span:last-child"
//    ));
//    int temp = Integer.parseInt(currentTemp.substring(0, 2));
//    int highestInTimeLine = temp;
//    int lowestInTimeLine = temp;
//        for (WebElement tempInTime: tempsInTimeLine) {
//        String sLIneTemp = tempInTime.getText();
//        int lineTemp = Integer.parseInt(sLIneTemp.substring(0, 2));
//        if (lineTemp > highestInTimeLine){
//            highestInTimeLine  = lineTemp;
//        }
//        if (lineTemp < lowestInTimeLine ){
//            lowestInTimeLine = lineTemp;
//        }
//
//    }
//
//System.out.println("Highest Temp:" + Integer.toString(highestInTimeLine));
//System.out.println("Lowest Temp:" + Integer.toString(lowestInTimeLine ));




//    private By Tempss = By.id("timeline");
//    public void Tempss() {Tempss.toString());}

    public void CurrentTempValue() { getTextFromElement(CurrentTempValue); }
    public void TempNow() { getTextFromElement(TempNow);}
    public void TwelveAm() { getTextFromElement(TwelveAm);}
    public void TwoAm() { getTextFromElement(TwoAm);}
    public void FourAm() { getTextFromElement(FourAm);}
    public void SixAm() { getTextFromElement(SixAm);}
    public void EightAm() { getTextFromElement(EightAm);}
    public void TenAm() { getTextFromElement(TenAm);}
    public void TwelvePm() { getTextFromElement(TwelvePm);}
    public void TwoPm() { getTextFromElement(TwoPm);}
    public void FourPm() { getTextFromElement(FourPm);}
    public void SixPm() { getTextFromElement(SixPm);}
    public void EightPm() { getTextFromElement(EightPm);}




//    List<WebElement> timeLineTemp = WebElement(id("timeline"));
}
