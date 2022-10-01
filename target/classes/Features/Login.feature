Feature: This is to verify login functionalities

  @smoke
  Scenario: This is to verify positive login
    Given User enter his username and password
    Then User click on login button
    And User verifies his login

  @sanity
  Scenario: This is to verify negative login
    Given User enter his invalid username and invalid password
    Then User click on login button
    And User verifies his login
