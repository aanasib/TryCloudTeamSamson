package com.tryCloud.step_definitions;

import com.tryCloud.pages.UpdateSettingsPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US73_UpdateSettingsStepDefs {
     UpdateSettingsPage updateSettingsPage = new UpdateSettingsPage();

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String expectedTitle = "Dashboard - Trycloud";
        BrowserUtils.verifyTitle(expectedTitle);
    }
    @Then("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        updateSettingsPage.files.click();

    }
    @Then("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        updateSettingsPage.btn_Settings.click();

    }
    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {
        updateSettingsPage.label_Show_RichWork_spaces.isSelected();

    }

    @Given("the user is on the login page with required <{string}>")
    public void theUserIsOnTheLoginPageWithRequired(String arg0) {

    }
}
