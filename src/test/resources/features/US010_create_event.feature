@CreateEvent
Feature: Create Calendar Event

  Background:
  Given  the user is on the login page


@driver
  Scenario: Verify that driver creates a Scrum Daily Meeting Calendar Event
  Given the user logged in as "driver"
  When the user navigates to the "Activities" - "Calendar Events"
  And user clicks on Create Calendar Event
  And user checks the Repeat checkbox
  When user enters "Scram daily meeting" in the Description


  @test
  Scenario: Verify that sales manager creates a Scrum Daily Meeting Calendar Event
    Given the user logged in as "sales manager"
    When the user navigates to the "Activities" - "Calendar Events"
    And user clicks on Create Calendar Event
    And user checks the Repeat checkbox
    When user enters "Scram daily meeting" in the Description


  @test
  Scenario: Verify that store manager creates a Scrum Daily Meeting Calendar Event
    Given the user logged in as "store manager"
    When the user navigates to the "Activities" - "Calendar Events"
    And user clicks on Create Calendar Event
    And user checks the Repeat checkbox
    When user enters "Scram daily meeting" in the Description