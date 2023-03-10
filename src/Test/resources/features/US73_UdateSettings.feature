@wip
Feature: As a user, I should be able to update settings.

  Background: User is already on the log in page
    Given the user is on the login page
   # Given the user is on the login page with required <"role">

Scenario: Verify the users can check any checkbox on the Files page.
  When the user clicks the "Files" module on dashboard
And user clicks Settings on the left bottom corner
Then the user should be able to click any checkbox
