Feature: As a user, I should be able to search any item/ users from the search icon.
  Agile Story: Users should be able to search any files/folder/users from the search box

  Background: User is logged in to the app
    Given user is logged in to the app

    #ExpectedTitle: "Dashboard-Trycloud"

  Scenario: Verify users can search any files/folder/users from the search box.
    When the user clicks the magnifier icon on the right top to open search box
    And the user search any existing file,folder,user name
    Then user enters the desired search
    Then verify the app displays the expected result option
# // hilight indicates 'no step',