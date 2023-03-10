package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentsPage extends DashboardPage {

    public CommentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsOption;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsTab;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement inputBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement postButton;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement actualComment;

    public String comment = "How are you?";
    public String expectedComment  = comment;

}
