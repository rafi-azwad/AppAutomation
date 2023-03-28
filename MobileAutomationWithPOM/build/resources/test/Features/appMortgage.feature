Feature: Mortgage Request

  @test3
  Scenario Outline: Mortgage Request with valid Data
    Given user in mortgage request page
    When user enter '<firstName>' '<lastName>'  '<age>' '<address1>' and '<address2>'
    And select country name
    And click next button
    And select type of loan number of years type of occupation and yearly income
    And click save button
    Then successfully back to home page
    Examples:
      | firstName | lastName | age | address1 | address2   |
      | Rafi      | Azwad    | 23  | Dhaka    | Mymensingh |