@web@wip
Feature: Dark Sky

  Scenario: Verify invalid signup error message
    Given I am on the darksky Register page
    When I click on Register buttom
    Then I verify page title message "Dark Sky API: Register"


