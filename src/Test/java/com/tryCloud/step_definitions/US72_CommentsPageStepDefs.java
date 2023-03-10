package com.tryCloud.step_definitions;

import com.tryCloud.pages.CommentsPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class US72_CommentsPageStepDefs {

    CommentsPage commentsPage = new CommentsPage();
    LoginPage loginPage = new LoginPage();

    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("user_username"));
        loginPage.passWord.sendKeys(ConfigurationReader.getProperty("user_password"));
        loginPage.LoginSubmitBtn.click();
    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        commentsPage.files.click();
        BrowserUtils.sleep(3);
    }
    @And("user click action-icon from any file on the current page")
    public void userClickActionIconFromAnyFileOnTheCurrentPage() {
        commentsPage.actionIcon.click();
    }
    @When("user choose the Details option")
    public void user_choose_the_details_option() {
        commentsPage.detailsOption.click();
        BrowserUtils.sleep(3);
    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        commentsPage.commentsTab.click();
        commentsPage.inputBox.sendKeys(commentsPage.comment);
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        commentsPage.postButton.click();
    }
    @Then("Verify the comment is displayed in the comment section")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        BrowserUtils.sleep(3);

        System.out.println(commentsPage.actualComment.isDisplayed());
    }


}
//
