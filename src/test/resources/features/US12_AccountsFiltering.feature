Feature: Accounts' page filters
  As a user, I want to filter customers’ info on the Accounts page.



  Background:
    Given  the user is on the login page


  @sales_manager_filter
  Scenario: Verify that users see 8 filter items on the Accounts page
    Given the user logged in as "sales manager"
    Then  user clicks the option Accounts under the menu option Customers
    Then  user is on the "All - Accounts - Customers" page
    And   user clicks the filters button
    Then  user should see the following 8 filter items:
      | Account Name: All  |
      | Contact Name: All  |
      | Contact Email: All |
      | Contact Phone: All |
      | Owner: All         |
      | Business Unit: All |
      | Created At: All    |
      | Updated At: All    |


  @store_manager_filter
  Scenario: Verify that users see 8 filter items on the Accounts page
    Given the user logged in as "store manager"
    Then  user clicks the option Accounts under the menu option Customers
    Then  user is on the "All - Accounts - Customers" page
    And   user clicks the filters button
    Then  user should see the following 8 filter items:
      | Account Name: All  |
      | Contact Name: All  |
      | Contact Email: All |
      | Contact Phone: All |
      | Owner: All         |
      | Business Unit: All |
      | Created At: All    |
      | Updated At: All    |

  @driver_account_filter
  Scenario: Verify that users see 8 filter items on the Accounts page
    Given the user logged in as "driver"
    Then  user clicks the option Accounts under the menu option Customers
    Then  user is on the "All - Accounts - Customers" page
    And   user clicks the filters button
    Then  user should see the following 8 filter items:
      | Account Name: All  |
      | Contact Name: All  |
      | Contact Email: All |
      | Contact Phone: All |
      | Owner: All         |
      | Business Unit: All |
      | Created At: All    |
      | Updated At: All    |