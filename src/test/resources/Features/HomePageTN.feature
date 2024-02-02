#Author: Mahdi Hadj Daoud
Feature: TUNISIANET home page

  Scenario: Checking the home page menus
    Given user is on home page
    When user hover on "Stockage" and hover on "Disque SSD" and click on
    Then user is directed to "Disque SSD" page
