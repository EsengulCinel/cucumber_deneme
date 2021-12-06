Feature: Register test
  Scenario Outline: Create an account
    Given Navigate to Website
    And click sign in button
    And type email "<Email>"
    And click on create an account button
    And choose tittle
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type company "<company>"
    And type address "<address>"
    Examples:
      | Email | firstname | lastname | password | company | address |
      |croselegolas@gmail.com|esen|gul|test123  |vodafone |maslak   |
