#Author: yamini
Feature: SDET

  Background: 
    Given user is on Home Page of website

  Scenario: trip details
    When user select a round trip option
    And select from and to destination
    Then select the Departure date  future Date

    When user enters traveller details
    And clicks search button
    Then user should see cheapest flights
