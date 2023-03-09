package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FilePage extends DashboardPage{

    public WebElement file;

    public FilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@data-id='files']/a)[1]")
    public WebElement filesModule;



    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;


    @FindBy(xpath = "//label[@for='file_upload_start'] ")
    public WebElement uploadFileOption;

}
// Thanks Attia and Million