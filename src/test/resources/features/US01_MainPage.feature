Feature: As a user, I should be accessing all the main modules of the app

  Background:

  @main
  Scenario: Verify main modules for Driver
    Given the user logged in as "driver"
    Then driver should see four main modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    @storemanager
  Scenario: Verify main modules eight Driver
    Given the user logged in as "store manager"
    Then store manager should see eight main modules
      | Dashboards      |
      | Fleet           |
      | Customers       |
      | Sales           |
      | Activities      |
      | Marketing       |
      | Reports & Segments |
      | System          |

  Scenario: Verify main modules eight Driver
    Given the user logged in as "sales manager"
    Then sales manager should see eight main modules
      | Dashboards      |
      | Fleet           |
      | Customers       |
      | Sales           |
      | Activities      |
      | Marketing       |
      | Reports & Segments |
      | System          |


