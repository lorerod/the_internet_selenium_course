package alerts;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testGetTextFromContextMenuAlert(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerContextMenu();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToDismiss();
        assertEquals(text, "You selected a context menu", "Alert text incorrect");
    }
}
