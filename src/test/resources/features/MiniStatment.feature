@Test08
  Feature: Mini Statement form
    Scenario: user taking it self mini statement
      Given open application in url browsers
      When enter the account no is "123456789"
      And click the submit buttons
      Then mini statement open should be successful