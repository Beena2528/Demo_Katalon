Feature: Add to cart products
  As user I want to add products in cart on https://cms.demo.katalon.com website


  Scenario: User should able be able to add products in to the cart
    Given I am on homePage
    When  I add four random items in my card
    And I click on view products
    Then I verify that all four product successfully added in card
    When I search for lowest price item
    And I remove lowest price item from the list
    Then I verify that all Three product successfully added in card









