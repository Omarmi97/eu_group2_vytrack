@sabire
Feature: Pin bar Functionality feature
  User story: As a user, I want to learn how to use the pinbar.
  Accounts are: driver, sales manager, store manager

  Background:
    Given  the user is on the login page

    @driver
    Scenario:Verify that user can click on “Learn how to use this space”
      Given the user logged in as "driver"
      When users click the "Learn how to use this space" link on the homepage
      And user should see "How To Use Pinbar"
      And user will see "Use pin icon on the right top corner of page to create fast access link in the pinbar."
      Then users should see an image on the page.

  @storeManagers
  Scenario:Verify that user can click on “Learn how to use this space”
    Given the user logged in as "store manager"
    When users click the "Learn how to use this space" link on the homepage
   And user should see "How To Use Pinbar"
    And user will see "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then users should see an image on the page.

  @salesManagers
  Scenario:Verify that user can click on “Learn how to use this space”
    Given the user logged in as "driver"
    When users click the "Learn how to use this space" link on the homepage
    And user should see "How To Use Pinbar"
    And user will see "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then users should see an image on the page.
