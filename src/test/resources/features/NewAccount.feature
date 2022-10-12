@Test05
  Feature: New Account
    Scenario: Open new account to manager
      Given open the application a url browser
      When Enter customerId is "mngr446206"
      And Select the account type is savings
      And fil the initial deposit is "10000"
      And Click on submit
      Then Open the New account should be successful