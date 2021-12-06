@SmokeTest
Feature: ContactUs
  Scenario: contacUs sayfasının kontrolu
    Given website git
    And click contactus button
    And select heading
    And type email
    And type referance
    And type mesaj
    When click send button
    Then verify success mesage