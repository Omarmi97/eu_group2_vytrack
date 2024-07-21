Feature: Vehicles Model Page

  Store manager and Sales manager can see columns on Vehicles Model page

  Background:
    Given the user is on the login page

  @storeManager
  Scenario: Verify that store managers can see 10 columns on the Vehicles Model page
    Given the user is logged in as "store manager"
    And the user navigates to the Vehicles Model page
    Then the user should see the following columns on the Vehicles Model page:
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

  @salesManager
  Scenario: Verify that sales managers can see 10 columns on the Vehicles Model page
    Given the user is logged in as "sales manager"
    And the user navigates to the Vehicles Model page
    Then the user should see the following columns on the Vehicles Model page:
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

  Scenario: Verify that drivers cannot access the Vehicles Model page
    Given the user is logged in as "driver"
    When the user navigates to the Vehicles Model page
    Then the user should see a permission message "You do not have permission to perform this action."
