package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    LoginPage loginPage = new LoginPage();


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user use username {string}")
    public void user_use_username(String string) {
        // String username = ConfigurationReader.getProperty("user_username");
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("user_username"));

    }

    @When("passcode “Userpass123\"")
    //@When("passcode “Userpass123\"")
    public void passcode_userpass123() {
        //String password = ConfigurationReader.getProperty("user_password");
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.LoginSubmitBtn.click();

    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

        loginPage.loginAsUser();
    }
}

/*

Feature: As a user, I should be able to log in.

  @wip
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>"
    And passcode “<password>"
    And user click the login button
    Examples:
      | username | password    |
      | user1    | Userpass123 |

 */