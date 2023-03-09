package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US68_UploadFile_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    FilePage filePage= new FilePage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String actualTittle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTittle.contains("Trycloud"));
    }

    @When("the user logged in as {string}")
    public void theUserLoggedInAs(String arg0) {
        loginPage.loginAsUser();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String Files) {
        filePage.filesModule.click();

    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        filePage.addIcon.click();

    }

    @When("the user uploads a file with the {string} option")
    public void the_user_uploads_a_file_with_the_option(String string) {
        filePage.uploadFileOption.click();

    }

    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(filePage.file.isDisplayed());
    }


}


