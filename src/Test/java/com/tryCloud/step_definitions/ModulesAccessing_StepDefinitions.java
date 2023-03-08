package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.TryCloud_ModulesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ModulesAccessing_StepDefinitions {

    TryCloud_ModulesPage tryCloud_modulesPage = new TryCloud_ModulesPage();
    @Given("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        LoginPage login = new LoginPage();
        login.loginAsUser();

    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(io.cucumber.datatable.DataTable dataTable) {

        for (WebElement each : tryCloud_modulesPage.allModules) {
            Assert.assertTrue(each.isDisplayed());

        }

    }
}
