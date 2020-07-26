Feature: Google Homepage
  This feature verifies the functionality of Google homepage

  Scenario: Check whether the main elements on Google homepage are displayed
    Given I launch Google Chrome browser
    When I open Google homepage
    Then I verify that search text box is displayed
    And Search button is displayed
    And button with text Im Feeling Lucky is displayed

  Scenario: Check whether the browser shows search results for a query
    Given I launch Google Chrome browser
    When I open Google homepage
    And enter selenium best tutorial
    Then I get a list of search results related to selenium
    And page title contains search query text
