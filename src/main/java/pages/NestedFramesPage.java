package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrameName = "frame-top";
    private String bottomFrameName = "frame-bottom";
    private String leftFrameName = "frame-left";
    private By bodyText = By.xpath("/html/body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToLeftFrame() {
        driver.switchTo().frame(topFrameName);
        driver.switchTo().frame(leftFrameName);
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame(bottomFrameName);
    }

    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String getLeftFrameText() {
        switchToLeftFrame();
        String text = driver.findElement(bodyText).getText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }

    public String getBottomFrameText() {
        switchToBottomFrame();
        String text = driver.findElement(bodyText).getText();
        switchToParentFrame();
        return text;
    }
}


