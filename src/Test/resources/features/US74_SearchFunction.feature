Feature: As a user, I should be able to search any item or users from the search icon
  Agile Story: Users should be able to search any files or folder or users from the search box

  Background: User is logged in to the app
    Given user is logged in to the app
    Given user is on the dashboard page

  Scenario: Verify users can search any files or folder or users from the search box
    When the user clicks the magnifier icon on the right top to open search box
    And the user search any existing file or folder or user name
    Then verify the app displays the expected result option

