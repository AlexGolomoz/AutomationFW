Feature: Login
  Scenario: Login with correct credentials
    Given I navigate to URL
    When I login with correct credentials login "" and password ""
    Then I am logged in with user ""