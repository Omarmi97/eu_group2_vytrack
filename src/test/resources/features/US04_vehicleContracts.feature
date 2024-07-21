@wip
Feature: Access vehicle contracts page

  User Story:
  As a user, I want to access to Vehicle Contracts page
  Accounts are: Store and Sales manager

  Background:
    Given  the user is on the login page

  @storeManagers
  Scenario: Verify users can access the Vehicle Contracts Page
    Given the user logged in as "store manager"
    When the user click Fleet to see the vehicle contracts page
    And the user click into vehicle contracts page
    Then the user should see title is as expected
  # expectedTitle: All - Vehicle Contract - Entities - System - Car - Entities - System

  @salesManagers
  Scenario: Verify users can access the Vehicle Contracts Page
    Given the user logged in as "sales manager"
    When the user click Fleet to see the vehicle contracts page
    And the user click into vehicle contracts page
    Then the user should see title is as expected
  # expectedTitle: All - Vehicle Contract - Entities - System - Car - Entities - System


  @driver
  Scenario: Verify that Drivers can NOT access the Vehicle Contracts
    Given the user logged in as "driver"
    When the driver click Fleet to see the vehicle contracts page
    And  the driver click into vehicle contracts page
    Then the driver see the prompt message
























