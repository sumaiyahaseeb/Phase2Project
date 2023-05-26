#author:sumaiya fathima
@browser
Feature: This feature will add a item to cart and verify if its added

  Background: 
    Given I have launched the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on login button
    Then I should land on home page
@WIP
  Scenario: Add the item to cart and validate if its added
    When I select the product name as "Sauce Labs Backpack"
    And I click on add to cart
    And then I go to cart
    Then I verify that same item is displayed in the cart
