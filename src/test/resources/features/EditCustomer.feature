@Test03
Feature: Edit customer form

  Scenario: login with a valid credentials 1
    Given Open the application in url browser
    When Enter customerId is "mngr446206" and click on sumbit button
    Then customer edit form should be successful
