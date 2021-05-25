Feature: Feature to tes hooks

  Scenario Outline: Login
    Given User is on Login Page
    And User enters <username> and <password>
    When user clicks on Login button
    Then user is navigated to homepage
        
    Examples:
    |username|password|
    |cjagtap|12345|
    |shweta|12345|

