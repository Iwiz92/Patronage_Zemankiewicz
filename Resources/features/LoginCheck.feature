Feature: I want to be able to login on page site

  Scenario: Successful login with valid credentials
    Given I open HomePage
    When I press SignIn link
    And I fill in EmailAddress with correct EmailAddress
    And I fill in Password with correct Password
    And I press SignIn button
    Then I see MyAccountPage

  Scenario: Unsuccessful login with invalid credentials
    Given I open HomePage
    When I press SignIn link
    And I fill in EmailAddress with incorrect EmailAddress
    And I fill in Password with incorrect Password
    And I press SignIn button
    Then I see error LoginFail

  Scenario: Unsuccessful login with without credentials
    Given I open HomePage
    When I press SignIn link
    And I enter blank EmailAddress
    And I enter blank Password
    And I press SignIn button
    Then I see error LoginFail