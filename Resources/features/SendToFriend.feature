Feature: I want to send a link to the product to my friend

  Scenario: Send a link to the product to a friend fill the friend's name and email
    Given I open HomePage
    When I choose the Blouse link
    And I press SendToAFriend link
    And I fill in my friend Name
    And I fill in my friend EmailAddress
    And I press SendToFriend button
    Then I see SuccessfulSendLinkMessage

    Scenario: Send a link to the product to a friend fill the friend's name and blank email
      Given I open HomePage
      When I choose the Blouse link
      And I press SendToAFriend link
      And I fill in my friend Name
      And I enter blank my friend EmailAddress
      And I press SendToFriend button
      Then I see error SendLinkFail

