Feature: Logout from the Swag labs page

  Scenario Outline: Check tha user can logout from the Swag labs

    Given  user is on login page
    And user enters <username> and <password>
    When user navigated to the left sidebar
    And user clicks the logout button
    Then user is logout from swag labs

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
#      | "locked_out_user"         |secret_sauce|
#      | "problem_user"            |secret_sauce|
#      | "performance_glitch_user" |secret_sauce|