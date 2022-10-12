@Test02
Feature: login guru99 project

  Scenario: login with valid credentials
    Given open application in url browser
    When Enter userid is "mngr446206" and password is "hyhyrud"
    And click the login button
    Then login should be successfuly