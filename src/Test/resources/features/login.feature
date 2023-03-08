Feature: As a user, I should be able to log in.

  @wip
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>"
    And passcode “<password>"
    And user click the login button

    Examples:
      | username | password    |
      | user1    | Userpass123 |
