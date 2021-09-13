package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By sliderInputField = By.tagName("input");
    private By resultText = By.id("range");

    public HorizontalSliderPage(WebDriver driver){this.driver = driver;}

    public void moveSlider(int places){
        for(int i =0; i < places*2; i++) {
            driver.findElement(sliderInputField).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
