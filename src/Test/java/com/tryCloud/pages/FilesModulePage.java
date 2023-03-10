package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage extends DashboardPage {

    public FilesModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //locators for US65
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement FilesCheckBox;


    @FindBy(xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> allFilesSelected;


    //locators for US71
    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIcon;

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteFileAction;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//td[@class='filename']")
    public List<WebElement> allDeletedFiles;

}


