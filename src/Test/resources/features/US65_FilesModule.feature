
Feature: As a user, I should be able to access to Files module.

  Background: User is already on the log in page
    Given the user is already on the login page
    Given the user log in with valid credentials
    When the user clicks on the "Files" module


  Scenario: verify users can access to Files module
    Then verify the page title is "Files - Trycloud”


  Scenario: verify users can select all the uploaded files from the page
    And user click the top-left checkbox of the table
    Then verify all the files are selected


