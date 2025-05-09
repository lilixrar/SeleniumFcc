package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        delay(1000);
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"), "\n The Message Does Not Contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();
    }

}
