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

    //locator for US74
    @FindBy(xpath = "/html/body/header/div[1]/ul/li[2]/a")
    public WebElement files;


    //locators for US65
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement FilesCheckBox;


    @FindBy(xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> allFilesSelected;


    //locators for US71
    @FindBy(xpath = "//span[@class='icon icon-more']")
    public List<WebElement> actionIcon;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/ul/li[8]/a/span[2]")
    public WebElement deleteFileAction;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//td[@class='filename']")
    public List<WebElement> allDeletedFiles;

}