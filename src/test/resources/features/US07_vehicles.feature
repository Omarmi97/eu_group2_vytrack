
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

