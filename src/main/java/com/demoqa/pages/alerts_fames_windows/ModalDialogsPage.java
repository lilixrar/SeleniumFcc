package com.demoqa.pages.alerts_fames_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage {

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'This is a small modal. It has very less content')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        click(closeButton);
    }

}
