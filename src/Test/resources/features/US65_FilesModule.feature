Feature: As a user, I should be able to access to Files module.

Background: For all scenarios, user is on the dashboard page of the Trycloud application.
  Given user is on the dashboard page
  When the user clicks the "Files" module


  Scenario: verify users can access to Files module
  Then verify the page title is "Files - Trycloud”


  Scenario: verify users can select all the uploaded files from the page
    And user click the top-left checkbox of the table
    Then verify all the files are selected