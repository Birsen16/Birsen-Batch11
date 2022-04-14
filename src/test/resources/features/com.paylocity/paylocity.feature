Feature: PayloCity tests
  @firstStep
  Scenario: Add employee no Discount

    Given the user logins in to Paylocity with following credentials
      | username | testUser |
      | password | Test1234 |
    When the user registers a new employee with following information
      | FirstName  | Birsen |
      | LastName   | Duman  |
      | Dependants | 0      |
   Then the user valitdates employee name is on the table
      | FirstName  | Birsen |
      | LastName   | Duman  |
      | Dependants | 0      |
    And the benefit cost calculations are correct

  Scenario: Add employee with Discount
    Given the user logins in to Paylocity with following username and password
      | username | testUser |
      | password | Test1234 |
    When the user registers a disconted new employee with following information!
      | FirstName  | Pelin |
      | LastName   | Duman  |
      | Dependants | 0      |
    Then the user validates discounted employee in the table!
      | FirstName  | Pelin |
      | LastName   | Duman  |
      | Dependants | 0      |
    And the user validates employee has a 10% discount

   Scenario: Edit employee
     Given the user logins in to Paylocity with following credentials
       | username | testUser |
       | password | Test1234 |
      When  the user select the Action Edit
      And the user can edit employee details
      Then the data should change in the table

   Scenario: Delete Employee
     Given the user logins in to Paylocity with following credentials
       | username | testUser |
       | password | Test1234 |
     When the user click the Action X
     Then the employee should be deleted.


