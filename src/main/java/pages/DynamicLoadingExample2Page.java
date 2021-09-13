package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    public DynamicLoadingExample2Page(WebDriver driver){this.driver = driver;}

    public boolean isStartButtonDisplayed(){
        if(driver.findElement(startButton).getText().equals("Start"))
            return true;
        else
            return false;
    }
}
