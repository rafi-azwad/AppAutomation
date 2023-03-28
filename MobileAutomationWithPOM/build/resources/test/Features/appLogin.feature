Feature: App Automation

  @test1
  Scenario Outline: user login with valid data
    Given user in the page
    When user enter '<username>' and '<password>'
    And click login button
    Then successfully open home page

    Examples:
      | username | password |
      | company  | company  |

