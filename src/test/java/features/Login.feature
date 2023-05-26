#author :sumaiya fathima
@browser
Feature: This feature will be used to create the login functionality of the saucedemo application

  Background: 
    Given I have launched the application

  @sanity
  Scenario: Validate the Login success scenario using parameters
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on login button
    Then I should land on home page

  @Regression
  Scenario Outline: Validate the login failure scenario using examples
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And I click on login button
    Then I should get the error message as "<Error>"

    Examples: 
      | UserName        | Password     | Error                                                                     |
      | standard_user   |        12345 | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
