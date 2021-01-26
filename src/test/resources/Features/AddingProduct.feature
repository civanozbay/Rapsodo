@all
Feature: Adding Product To The Cart
  Background:
    Given the user is on the home page


  Scenario: Click on DIAMOND SPORTS
    Given the user hover over on "SHOP" menu item
    When click on DIAMOND SPORTS option
    And verify url opening category "?category=diamond-sports"
    Then verify there is "0" items at the cart
    And verify price amount is "$0.00"


  Scenario: Click on HITTING 2.O product
    Given the user hover over on "SHOP" menu item
    And click on DIAMOND SPORTS option
    When click on HITTING product
    And verify url following this "/product/rapsodo-hitting-monitor/"
    And browser title should be "Hitting 2.0 | Rapsodo"
    And product SKU value should be "RBB01H"
    Then verify add to cart button is disabled

  Scenario: Choosing "No Plan" as option
    Given the user hover over on "SHOP" menu item
    And click on DIAMOND SPORTS option
    When click on HITTING product
    And choose "No Plan" as option
    And price should be "$4,000.00"
    Then verify add to cart button is enabled

  Scenario: Click on ADD TO CART button
    Given the user hover over on "SHOP" menu item
    And click on DIAMOND SPORTS option
    When click on HITTING product
    And choose "No Plan" as option
    And click on add to cart button
    Then verify url following this "/cart/"
    And verify there is "1" items at the cart
    Then verify price amount is "$4,000.00"
  @wip
  Scenario: Random Coupon code
    Given the user hover over on "SHOP" menu item
    And click on DIAMOND SPORTS option
    When click on HITTING product
    And choose "No Plan" as option
    And click on add to cart button
    Then enter this "qweasd123" coupon code
    #And verify error message is displayed
