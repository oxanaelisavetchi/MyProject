Feature: Product page functionality

  Scenario : Check if product title label is displayed

    Given user is on login page
    When user enters <username> and <password>
    And clicks on login-button
    Then product title label is displayed on the home page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
#      | locked_out_user         | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |


#  Scenario Outline: Check if inventory items are displayed correctly
#
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login-button
#    Then Products are displayed
#
#    Examples:
#      | username      | password     |
#      | standard_user | secret_sauce |
#      | locked_out_user         | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |


#  Scenario Outline: Check if product sort option ZA is working correctly
#
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login-button
#    And user click the sort button ZA
#    Then sorted correctly
#    Examples:
#      | username                | password     |
#      | standard_user           | secret_sauce |
#      | locked_out_user         | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |
