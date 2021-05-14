Feature: Test login with parametarization

  Scenario Outline: Login With Params
    Given user is on browser
    And user navigates to login
    When enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page
    And user logs offs

    Examples: 
      | username | password |
      | Chetan   |    12345 |
      | Shweta   |    12345 |
