package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesModulePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.SearchFunctionPage_MC;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US74_StepDefs extends DashboardPage {
    SearchFunctionPage_MC searchFunctionPage_MC = new SearchFunctionPage_MC();

            FilesModulePage filesModulePage = new FilesModulePage();
            LoginPage loginPage = new LoginPage();

@Given("user is logged in to the app")
public void user_is_logged_in_to_the_app() {
        loginPage.loginAsUser();
        }

@Given("user is on the dashboard page")
public void user_is_on_the_dashboard_page() {
       // Driver.getDriver().get("http://qa2.trycloud.net/index.php/apps/dashboard/");
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login?clear=1");

        }

        /**
         * Waits for the provided element to be visible on the page
         *
         * @param //element
         * @param time
         * @return
         */

        public static WebElement waitForVisibility(WebElement searchBar, int time) {
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
                return wait.until(ExpectedConditions.visibilityOf(searchBar));
        }
@When("the user clicks the magnifier icon on the right top to open search box")
public void the_user_clicks_the_magnifier_icon_on_the_right_top_to_open_search_box() {
        searchFunctionPage_MC.searchBar.click();
        }

        @And("the user search any existing file or folder or user name")
        public void theUserSearchAnyExistingFileOrFolderOrUserName() {
                searchFunctionPage_MC.searchBox.sendKeys("Files");
                searchFunctionPage_MC.searchBox.sendKeys(Keys.ENTER);
        }

/*@And("the user search any existing file,folder,user name")
public void theUserSearchAnyExistingFileFolderUserName() {
        searchFunctionPage_MC.searchBox.sendKeys("Files");
        searchFunctionPage_MC.searchBox.sendKeys(Keys.ENTER);
        }*/

@Then("verify the app displays the expected result option")
public void verify_the_app_displays_the_expected_result_option() {
        for (WebElement each : searchFunctionPage_MC.filesDisplayed){
        Assert.assertTrue(each.isDisplayed());}
}


}