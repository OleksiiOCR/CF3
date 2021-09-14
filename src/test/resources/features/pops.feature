Feature: Pops
  @smoke @promotion
 Scenario: getting pops site up in google search
   Given I am navigating to the google
   Then I am inputting "sports bar with poker" in search window
   Then I am clicking "search" button
   Then I am clicking "menu" button

