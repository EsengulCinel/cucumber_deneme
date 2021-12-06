
Feature: login
  Scenario: Go to amazon and test login page
    Given Amazon sitesine git
    And logine tıkla
    And isim gir
    And sifre gir
    When submite tıkladığımda
    Then success mesajını verify et