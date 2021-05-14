Feature: Feature to test google search

  Scenario: Google Search
    Given browser is open
    And user is on google page
    When user enters search string
    And hits enter
    Then user should be navigated to Search results
