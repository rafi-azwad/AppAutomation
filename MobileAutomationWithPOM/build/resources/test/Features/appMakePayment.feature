Feature: Make Payment

  @test2
  Scenario Outline: Make Payment with valid data

    Given user in the make payment page
    When user enter '<phone>' '<name>' and '<amount>'
    And select the country name
    And click send payment button
    Then successfully make payment
    Examples:
      | phone       | name | amount |
      | 01677156262 | rafi | 10     |
