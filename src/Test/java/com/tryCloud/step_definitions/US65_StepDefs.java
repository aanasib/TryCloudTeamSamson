package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesModulePage_AN;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US65_StepDefs {

        FilesModulePage_AN filesModulePageAn = new FilesModulePage_AN();

        //TC1

        @Given("user is on the dashboard page")
        public void user_is_on_the_dashboard_page() {
                Driver.getDriver().get("http://qa2.trycloud.net/index.php/apps/dashboard/");

        }

        @When("the user clicks the {string} module")
        public void the_user_clicks_the_module(String Files) {
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

        }
}



