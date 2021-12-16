Feature: Register Test

  Background:
    Given Navigate to Website
    And click sign in button
    And  type email "esengul.cinel@vodafone.com"
    And click on create an account button

  Scenario: Kişi 1
    And type firstname "esen" and lastname "gul"
    And type password "deneme123"

  Scenario: Kisi 2
    And  type company "vodafone"
    And type address "Maslak"

  Scenario Outline: Kisi 3

    And type firstname "<isim>" and lastname "<soyisim>"
    And type password "<sifre>"
    And  type company "<sirket>"
    And  type address "<adres>"
    Examples:
      | isim | soyisim | sifre | sirket | adres |
      |Ali|Veli |1234   |Turkcell  |Turkey|
      |Ayse  |Fatma | 4567  |TurkTelekom    |USA|



