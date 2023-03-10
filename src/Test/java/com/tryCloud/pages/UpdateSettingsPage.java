package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateSettingsPage extends DashboardPage {

    public UpdateSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement btn_Settings;

    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement label_Show_RichWork_spaces;
}
