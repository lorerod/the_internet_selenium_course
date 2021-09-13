package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuField = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){this.driver = driver;}

    public void triggerContextMenu(){
        WebElement contextMenu = driver.findElement(contextMenuField);

        Actions actions = new Actions(driver);
        actions.contextClick(contextMenu).perform();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

}
