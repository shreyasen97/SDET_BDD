#Author: Saurbh Raj
Feature: SDET

  Background: 
    Given user is on Home Page

  Scenario Outline: Registration Scenario
    When user clicks on Register option
    And user enter <firstname>,<lastname>,<Email>,<Password>,<Confiormpassword>,<month>,<year>and<zipcode>
    Then user able to see a message regestraion is completed

    Examples: 
      | firstname |  | lastname |  | Email                   |  | Password  |  | Confiormpassword |  | month |  | year |  | zipcode |
      | ms        |  | dhoni    |  | Msd7honi15424@gmail.com |  | dhoni@123 |  | dhoni@123        |  |     7 |  | 1982 |  |  521229 |

  Scenario: Login Scenario
    Given user is on login Page
    When user enter Email and password
    Then user able to log in

  Scenario: Reset password
    Given user is on login Page
    And user clicks on Need help remembering your password
    When user enters email
    Then user sees appropriate message
