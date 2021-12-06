Feature: Register test

  Background:
    Given Navigate to Website
    And click sign in button
    And type email "croselegolas@gmail.com"
    And click on create an account button


    Scenario: Kisi1
      And type firstname "esen" and lastname "gul"
      And type password "deneme123"

    Scenario: Kisi2
      And type company "vodafone"
      And type address "Istanbul"

    Scenario Outline:Kisi3
      And type firstname "<isim>" and lastname "<soyisim>"
      And type password "<sifre>"
      And type company "<sirket>"
      And type address "<adres>"
      Examples:
        | isim | soyisim |sifre|sirket|adres|
        |esen  |cinel    |deneme123|vodafone|istanbul|
