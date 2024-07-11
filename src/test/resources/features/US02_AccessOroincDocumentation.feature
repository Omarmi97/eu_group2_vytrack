Feature: Access to the Oroinc Documentation page
  Agile story: As a truck driver I should be able to access the Oronic Documentation page

@WIP1
  Scenario: Verify that truck drivers access to the Oroinc Documentation page by clicking the
  question mark icon
    Given truck driver is logged in on the vytrack page
    And truck driver clicks on icon
    Then truck driver switches window handles
    Then truck driver gets access to the Oroinc Documentation page
