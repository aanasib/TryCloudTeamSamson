package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchFunctionPage_MC extends DashboardPage {

    public SearchFunctionPage_MC(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> filesDisplayed;

    @FindBy(xpath = "//div[contains(@class, 'icon-confirm')]")
    public WebElement enterSearch;

}