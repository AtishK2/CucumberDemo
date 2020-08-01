Feature: Cogmento Application login feature
  I should be able to test the login feature for Cogmento application

  Scenario: Verify if user is able to login with correct credentials
    Given application is already launched in browser
    When user enters correct username and password
      | Sampleusers@yopmail.com | Sample@123 |
    Then homepage is displayed
    Then user should be able to logout from the application