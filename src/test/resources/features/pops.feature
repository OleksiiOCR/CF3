Feature: Pops
  @smoke @promotion
 Scenario: getting pops site up in google search
   Given I am navigating to the google
   Then I am inputting "richmond poker" in search window
   Then I am clicking "Pops poker" link
   Then I am clicking "Website" button
    And Navigating back
    Then I am clicking "Directions" button
    And Navigating back
    Then I am clicking "Facebook" button


