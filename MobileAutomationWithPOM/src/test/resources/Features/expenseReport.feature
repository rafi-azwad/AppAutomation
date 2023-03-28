Feature: Expense Report
  @test4
  Scenario: Add Expense and Logout
    Given user in expense report page
    When click add button successfully add expense
    And click back button and go back home page
    Then click logout
