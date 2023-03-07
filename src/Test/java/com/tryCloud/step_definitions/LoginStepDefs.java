package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = "User1";
        String password ="Userpass123";

        if(userType.equalsIgnoreCase("user")){
            username = ConfigurationReader.getProperty("user_username");
            password = ConfigurationReader.getProperty("user_password");
        }else if(userType.equalsIgnoreCase("employee")){
            username = ConfigurationReader.getProperty("employee_username");
            password = ConfigurationReader.getProperty("employee_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
