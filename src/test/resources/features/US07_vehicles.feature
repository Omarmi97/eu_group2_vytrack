
Feature: Library vehicles feature

  User Story:
  As a user I should be able to select any vehicle from the
  Vehicles page
  Accounts are: Sales and Store manager

  Background:
    Given  the user is on the login page


@vehicle_sales_manager
  Scenario: Verify all checkboxes are unchecked on Vehicles page
  Given the user logged in as "sales manager"
  Then user is on the Vehicles page
  Then user should see all checkboxes as unchecked

  @vehicle_store_manager
  Scenario: Verify all checkboxes are unchecked on Vehicles page
    Given the user logged in as "store manager"
    Then user is on the Vehicles page
    Then user should see all checkboxes as unchecked

    @firstCheckBox_sales_manager
  Scenario: User selects all cars by checking the first checkbox
    Given the user logged in as "sales manager"
    When user is on the Vehicles page
    Then the user clicks the first checkbox
    Then all cars should be selected

  @firstCheckBox_store_manager
  Scenario: User selects all cars by checking the first checkbox
    Given the user logged in as "store manager"
    When user is on the Vehicles page
    Then the user clicks the first checkbox
    Then all cars should be selected


  Scenario: Select a vehicle from the Vehicles page
    Given the user logged in as "store manager"
    When user is on the Vehicles page
    Then I select the vehicle with checkbox
    Then the vehicle should be selected

