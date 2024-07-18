@B34G2-197
Feature: Library vehicles feature

  User Story:
  As a user I should be able to select any vehicle from the
  Vehicles page
  Accounts are: Sales and Store manager

  Background:
    Given  the user is on the login page


@B34G2-195
  Scenario: Verify all checkboxes are unchecked on Vehicles page
  Given the user logged in as "sales manager"
  Then user is on the Vehicles page
  Then user should see all checkboxes as unchecked

 @B34G2-196
  Scenario: Verify all checkboxes are unchecked on Vehicles page
    Given the user logged in as "store manager"
    Then user is on the Vehicles page
    Then user should see all checkboxes as unchecked

   @B34G2-198
  Scenario: User selects all cars by checking the first checkbox
      Given the user logged in as "sales manager"
      When user is on the Vehicles page
      Then the user clicks the first checkbox
      Then all cars should be selected

 @B34G2-199
  Scenario: User selects all cars by checking the first checkbox
    Given the user logged in as "store manager"
    When user is on the Vehicles page
    Then the user clicks the first checkbox
    Then all cars should be selected

@B34G2-201
  Scenario: Select a vehicle from the Vehicles page
    Given the user logged in as "sales manager"
    When user is on the Vehicles page
  Then user select the vehicle with driver "Martin Upton"
  Then the driver "Martin Upton" should be selected

  @B34G2-202
  Scenario: Select a vehicle from the Vehicles page
    Given the user logged in as "store manager"
    When user is on the Vehicles page
    Then user select the vehicle with driver "Martin Upton"
    Then the driver "Martin Upton" should be selected



