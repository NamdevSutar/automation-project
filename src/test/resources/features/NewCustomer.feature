@Test01
Feature: this is manager feature

  Scenario: Add new customer
    Given Open application url in browser
    When Add the customer name "Namdev"
    And Click on Gender "male"
    And fill the Date of birth "08/02/1993"
    And fill the Address "Samarth colony wakad pune",and city is "pune"
    And fill the state is "Maharashtra" and pin code is "411033"
    And Add the telephone number "7038150504" and add Email id "namdevsutar01@gmail.com"
    And Click the submit button
    Then  Add new customer should be successful


