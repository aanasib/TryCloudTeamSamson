package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilesModulePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US65_StepDefs {


    FilesModulePage filesModulePageAn = new FilesModulePage();
    LoginPage loginPage = new LoginPage();

    //TC1
    @Given("the user is already on the login page")
    public void theUserIsAlreadyOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("the user log in with valid credentials")
    public void theUserLogInWithValidCredentials() {
        loginPage.loginAsUser();
    }

    @When("the user clicks on the {string} module")
    public void theUserClicksOnTheModule(String arg0) {
        filesModulePageAn.files.click();

    }

    @Then("verify the page title is \"Files - Trycloud”")
    public void verify_the_page_title_is_files_trycloud() {
        BrowserUtils.verifyTitle("Files - Trycloud");

    }

    //TC2
    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesModulePageAn.FilesCheckBox.click();

    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        for (WebElement each : filesModulePageAn.allFilesSelected) {
            Assert.assertTrue(each.isSelected());
        }
    }

}


