package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


    public class TryCloud_ModulesPage extends DashboardPage {

        public TryCloud_ModulesPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//div[@class='header-left']")
        public List<WebElement> allModules;
    }


