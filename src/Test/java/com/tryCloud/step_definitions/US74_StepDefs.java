package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesModulePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.SearchFunctionPage_MC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US74_StepDefs extends DashboardPage {

    SearchFunctionPage_MC searchFunctionPage_MC = new SearchFunctionPage_MC();
    FilesModulePage filesModulePage = new FilesModulePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is logged in to the app")
    public void user_is_logged_in_to_the_app() {
        loginPage.loginAsUser();
    }

    @When("the user clicks the magnifier icon on the right top to open search box")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top_to_open_search_box() {
        searchFunctionPage_MC.searchBar.click();
    }

    @And("the user search any existing file,folder,user name")
    public void theUserSearchAnyExistingFileFolderUserName() {
        searchFunctionPage_MC.searchBox.sendKeys("Files");

    }
    @Then("user enters the desired search")
    public void userEntersTheDesiredSearch() {
        searchFunctionPage_MC.enterSearch.click();
    }

    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {
        for (WebElement each : searchFunctionPage_MC.filesDisplayed) {
            Assert.assertTrue(each.isDisplayed());
        }
    }
}


