Feature: As a user, I should be able to delete a file/folder.
  Background: Delete a file or folder
    Given User on the dashboard page

  Scenario: Verify users delete a file/folder

    When the user clicks the "Files" module
    And user click action-icon from any file on the page
    And user choose the "Delete file/folder" option
    When the user clicks the "Deleted file/folder" sub-module on the left side
    Then Verify the deleted file is displayed on the Deleted Files page.