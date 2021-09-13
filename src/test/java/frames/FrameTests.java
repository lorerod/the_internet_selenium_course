package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickCWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromTextArea(), text1+text2,"Text from editor incorrect");
    }

    /**
    * @
    **/
    @Test
    public void testNestedFrames(){
        var framePage = homePage.clickFramesPage();
        var nestedframePage = framePage.clickNestedFrames();

        assertEquals(nestedframePage.getLeftFrameText(), "LEFT","Text from editor incorrect");
        assertEquals(nestedframePage.getBottomFrameText(), "BOTTOM","Text from editor incorrect");

    }
}
