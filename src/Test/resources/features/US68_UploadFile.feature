@wip
Feature: TryCloud upload a file feature.

  Background:
    Given user is logged in to the app on the app
    When the user clicks the "Files" module

  Scenario: Verify users can upload a file from Files
    When the user clicks the add icon on the top
    And the user uploads a file with the "upload file" option
    Then Verify the file is displayed on the page