package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.gotoElements().clickTextBox();
        textBoxPage.setFullName("Elisse Campos");
        textBoxPage.setEmail("elissec22@gmail.com");
        textBoxPage.setCurrentAddress("603 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 2030");
        textBoxPage.setCurrentAddress("Los Angeles, California");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 2030"), "\n Actual Address Does Not Contain 2030 \n");

    }

}
