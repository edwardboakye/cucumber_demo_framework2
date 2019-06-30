@web@wip
Feature: Current Temperature

 Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
    Given I am on the home page
    Then I verify current temperature is not greater or less than temperature from daily timeline