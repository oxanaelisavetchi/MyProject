Feature: feature to test login functionality

@UI
  @ValidCredentials
  Scenario Outline: Check login is successful with valid credentials

    Given user is on login page
#    When user logs in with credentials: <login>, <password>
    When user enters <login> in usernameField
    And user enters <password> in passwordField
#    Then user is redirected to the home page

    Examples:
      | login                   | password     |
      | standard_user           | secret_sauce |
#      | locked_out_user         | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |


#  @InvalidPassword
#  Scenario Outline: Check the login functionality with valid usernames and invalid passwords
#
#    When user enters correct <username> and <password>
#    And clicks on login-button
#    Then user didn't navigate to Swag labs home page
#
#    Examples:
#
#      |username|password|errorMessage|
#      |standard_user|secrets_sauce|"Epic sadface: Username is required"|
#      |locked_out_user|""|Epic sadface: Username is required|
#      |problem_user|" "|Epic sadface: Username is required|
#      |performance_glitch_user secret_sauced|Epic sadface: Username is required|
#
#
#  @InvalidUsername
#  Scenario Outline: Check the login functionality with invalid username and valid password
#
#    When user enteres correct <username> and <password>
#    And clicks on login-button
#    Then user didn't navigate to Swag labs home page
#    Examples:
#
#      | username   |password     |
#      | wrong_user |secret_sauce |
#
#
#
#  @MissingCredentials
#  Scenario Outline: Check the error message when login with blank username and password
#    When user enteres correct <username> and <password>
#    And clicks on login-button
#    Then Correct error message is displayed
#
#    Examples:
#      | username |password |
#      | ""       |""       |
#
#
#
#
#
#
#