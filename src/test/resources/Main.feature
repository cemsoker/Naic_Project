Feature: Test MainPage Functionality

  @smoke
  Scenario: Testing Links
    Given I am on the webPage
    When I test allLinks
    Then I validate