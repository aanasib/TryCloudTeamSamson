package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US68_UploadFile_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    FilePage filePage = new FilePage();


    @Given("user is logged in to the app on the app")
    public void userIsLoggedInToTheAppOnTheApp() {
        loginPage.loginAsUser();
        BrowserUtils.sleep(3);
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
        filePage.files.click();
        BrowserUtils.sleep(3);
    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        filePage.addIcon.click();
        BrowserUtils.sleep(3);
    }

    @When("the user uploads a file with the {string} option")
    public void the_user_uploads_a_file_with_the_option(String string) {
        filePage.uploadFileOption.click();
        BrowserUtils.sleep(3);

    }

    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        for (WebElement myFile : filePage.myUploadedFile) {
            Assert.assertTrue(myFile.isDisplayed());
            BrowserUtils.sleep(3);
        }

    }


}