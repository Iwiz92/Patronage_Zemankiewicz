Feature: I want to write a comment on the product and evaluate it

  Scenario: Add a comment and rating on the product with valid credentials
    Given I open HomePage
    When I press SignIn link
    And I fill in EmailAddress with correct EmailAddress
    And I fill in Password with correct Password
    And I press SignIn button
    And I press logo on the site
    And I choose the Blouse link
    And I press WriteAReview link
    And I give fiveStars to the product
    And I fill TitleComment about product
    And I fill Comment about product
    And I press SendComment button
    Then I see successAddComment

    Scenario: Product rating without comment with valid credentials
      Given I open HomePage
      When I press SignIn link
      And I fill in EmailAddress with correct EmailAddress
      And I fill in Password with correct Password
      And I press SignIn button
      And I see MyAccountPage
      And I press logo on the site
      And I choose the Blouse link
      And I press WriteAReview link
      And I give fiveStars to the product
      And I enter blank TitleComment about product
      And I enter blank Comment about product
      And I press SendComment button
      Then I see errorAddComment

