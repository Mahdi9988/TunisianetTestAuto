#Author: Mahdi Hadj Daoud
Feature: Search for a product

  Scenario: Verification of the search product
    Given User is on the home page
    When User Search for a specific product "Clavier Havit KB216 / Noir"
    Then User Check the search result is find "Clavier Havit KB216 / Noir"
