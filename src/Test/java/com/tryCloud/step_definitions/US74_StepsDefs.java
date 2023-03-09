package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.SearchFunctionPage_MC;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US74_StepsDefs {

    SearchFunctionPage_MC searchFunctionPage_MC = new SearchFunctionPage_MC();

    LoginPage loginPage = new LoginPage();

    @Given("user is logged in to the app")
    public void user_is_logged_in_to_the_app() {
        loginPage.loginAsUser();
    }

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/apps/dashboard/");
    }

    //5. Assert:Title contains "http://qa2.trycloud.net/"
    String expectedInTitle = "Dashboard-Trycloud";

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyTitleContains(String expectedInTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    @When("the user clicks the magnifier icon on the right top to open search box")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top_to_open_search_box() {
        searchFunctionPage_MC.searchIcon.click();
        //searchFunctionPage_MC.searchIcon.sendKeys("Files", Keys.ENTER);
        //searchFunctionPage_MC.searchIcon.sendKeys("Files");
        // searchFunctionPage_MC.searchIcon.sendKeys(Keys.ENTER);
    }

    @And("the user search any existing file\\/folder\\/user name")
    public void theUserSearchAnyExistingFileFolderUserName() {
        searchFunctionPage_MC.searchIcon.sendKeys("Files");
        searchFunctionPage_MC.searchIcon.sendKeys(Keys.ENTER);
    }

    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {

    }

    public static WebElement waitForVisibility(WebElement searchBar, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        return wait.until(ExpectedConditions.visibilityOf(searchBar));
    }



}





















