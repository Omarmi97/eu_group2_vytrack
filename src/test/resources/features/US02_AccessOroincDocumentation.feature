@B34G2-223
Feature: Access to the Oroinc Documentation page

  Background:
    Given the user is on the login page

@@B34G2-219
  Scenario: Verify that the user can access the Oroinc Documentation page by clicking the
  question mark icon

    Given the user logged in as "driver"
    And user clicks on the question mark icon
    Then user should switches window handles
    Then the user should gets access to the Oroinc Documentation page


  @B34G2-220
  Scenario: Verify that the user can access the Oroinc Documentation page by clicking the
  question mark icon

    Given the user logged in as "store manager"
    And user clicks on the question mark icon
    Then user should switches window handles
    Then the user should gets access to the Oroinc Documentation page


  @B34G2-221
  Scenario: Verify that the user can access the Oroinc Documentation page by clicking the
  question mark icon

    Given the user logged in as "sales manager"
    And user clicks on the question mark icon
    Then user should switches window handles
    And the user should gets access to the Oroinc Documentation page




  #@WIP1
  #  Scenario: Verify that truck drivers access to the Oroinc Documentation page by clicking the
  #  question mark icon
  #    Given truck driver is logged in on the vytrack page
  #    And truck driver clicks on icon
  #    Then truck driver switches window handles
  #    Then truck driver gets access to the Oroinc Documentation page