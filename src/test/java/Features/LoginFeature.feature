Feature: Login Functionality for the application

  Background:
    Given User is on the login page

  Scenario Outline: User is able to successfully login to the system
    When User enters "<UserName>" as UserName and "<Password>" as Password
    And User clicked on Submit Button
    Then User is landed to the homepage
    Examples:
    |UserName|Password|
    |TestUser1|TestPassword1|
    |TestUser2|TestPassword2|
    |student|Password123|


    Scenario: User is able to successfully login to the system
      When User enters UserName and Password
        |student|Password123|
      And User clicked on Submit Button
      Then User is landed to the homepage


