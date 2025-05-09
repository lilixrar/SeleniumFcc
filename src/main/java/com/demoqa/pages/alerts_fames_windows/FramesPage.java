package com.demoqa.pages.alerts_fames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    private void switchToBigBox() {
        // driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox() {
//        switchToFrameIndex(2);
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        delay(1000); // slow internet :<
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        delay(1000); // slow internet :<
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }




}
