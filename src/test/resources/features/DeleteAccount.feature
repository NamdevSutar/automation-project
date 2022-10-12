@Test07
  Feature: Delete account
    Scenario: delete account to the manager
      Given Open the applications in a url browser
      When enter the account number is "123456789"
      And click on the submit button
      Then account delete should be successful