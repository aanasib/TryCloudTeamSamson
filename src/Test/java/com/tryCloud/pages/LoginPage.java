package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DashboardPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "submit-form")
    public WebElement LoginSubmitBtn;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        passWord.sendKeys(passwordStr);
        LoginSubmitBtn.click();
        // verification that we  are logged in
    }

    public void loginAsUser(){
        String username = ConfigurationReader.getProperty("user_username");
        String password = ConfigurationReader.getProperty("user_password");
        userName.sendKeys(username);
        passWord.sendKeys(password);
        LoginSubmitBtn.click();

    }
    public void loginAsEmployee(){
        String username = ConfigurationReader.getProperty("employee_username");
        String password = ConfigurationReader.getProperty("employee_password");
        userName.sendKeys(username);
        passWord.sendKeys(password);
        LoginSubmitBtn.click();

    }
}