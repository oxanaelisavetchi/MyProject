Feature: Display login error messages

  Scenario Outline: Check the error message when login with blank username and password

    Given user is on login page
    When user enters <username> and <password>
    And clicks on login-button
    Then correct error message is displayed

    Examples:
      | username | password |
      | ""       | ""       |


#  Scenario Outline: Check the error message when login with wrong username and password
#
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login-button
#    Then correct error message is displayed
#
#    Examples:
#      | username | password |
#    |error     |error     |



