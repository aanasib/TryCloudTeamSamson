package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage_AN {

    public FilesModulePage_AN(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement FilesCheckBox;


}

