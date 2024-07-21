Feature:

  Background: User is already in the log in page


  Scenario Outline: User should be able to see the error message, when click the Vehicle Odometer module.
    Given the user logged in with "<username>", "<password>"
    When user should be able to click Fleet modules
    When user should be able to click Vehicle Odometer modules
    Then user should be able to see "You do not have permission to perform this action."

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |


  Scenario:User should be able to see the default page as 1 and View Per Page as 25 by default.
    Given user in logged as Driver
    When user should be able to click on Fleet modules
    When user should be able to click Vehicle Odometer modules
    Then user should be able to see by default page "1"
    Then user should be able to see View Per Page as "25" by default







