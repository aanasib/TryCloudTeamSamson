package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionPage_MC extends DashboardPage {

    public SearchFunctionPage_MC (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "input[@type='search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//*[@id='initial-state-talk-prefer_h264']")
    public WebElement searchBox; //

    ////input[@type='search']

    ////*[@id ] ='initial-state-talk-prefer_h264' // locator search box

}
