@CreateEvent
Feature: Create Calendar Event

  Background:
  Given  the user is on the login page


  Scenario: Verify that driver creates a Scrum Daily Meeting Calendar Event
    Given the user logged in as "driver"
    When driver navigates to the Activities tab
    And driver clicks on Calendar Events
    And driver clicks on Create Calendar Event
    And driver checks the Repeat checkbox
    When driver enters "Scram daily meeting" in the Description
    Then the event "Scram daily meeting" should be displayed
  @test
  Scenario: Verify that sales manager creates a Scrum Daily Meeting Calendar Event
    Given the user logged in as "sales manager"
    When sales manager navigates to the Activities tab
    And sales manager clicks on Calendar Events
    And sales manager clicks on Create Calendar Event
    And sales manager checks the Repeat checkbox
    When sales manager enters "Scram daily meeting" in the Description
    Then the event "Scram daily meeting" should be displayed
  @test
  Scenario: Verify that store manager creates a Scrum Daily Meeting Calendar Event
    Given the user logged in as "store manager"
    When store manager navigates to the Activities tab
    And store manager clicks on Calendar Events
    And store manager clicks on Create Calendar Event
    And store manager checks the Repeat checkbox
    When store manager enters "Scram daily meeting" in the Description
    Then the event "Scram daily meeting" should be displayed