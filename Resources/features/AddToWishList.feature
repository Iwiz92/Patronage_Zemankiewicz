Feature: I want to add product to my wish list

  Scenario: Add product to wishlist with without credentials
    Given I open HomePage
    When I choose the Blouse link
    And I press AddToWishlist link
    Then I see error FailToAddWishList

    Scenario: Add producut to wishlist with valid credentials
      Given I open HomePage
      When I press SignIn link
      And I fill in EmailAddress with correct EmailAddress
      And I fill in Password with correct Password
      And I press SignIn button
      And I press logo on the site
      And I choose the Blouse link
      And I press AddToWishlist link
      Then I see successMessageAddToWishlist
