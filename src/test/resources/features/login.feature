Feature: Login Facebook

  Scenario: yanlis parol ile daxil olmag calisiram //1
    Given men facebook ana sehifesine gedirem
    When username hissesine istifadeci adini yaziram
    And password hissesine yanlis parol yaziram
    And login duymesine sixiram
    Then xeta mesaji ekranda gorunur

  Scenario: dogru parol ile daxil olmag calisiram //2
    Given facebook ana sehifesine gedirem
    When username hissesine yalnis username yaziram
    And password hissesine dogru parol yaziram
    And login duymesine basiram
    Then ekranda xeta mesaji gorunur

  Scenario: username bos buraxib giris etmeye calisiram   //3
    Given facebook sehifesine gedirem
    When username hissesini bos buraxiram
    And password hissesine duzgun parol yaziram
    And login duymesini basiram
    Then ekranda xeta mesaji cixir


  Scenario: parol bos buraxib giris etmeye calisiram  //4
    Given facebook sehifesine kecid edirem
    When username hissesine dogru deyer yaziram
    And password hissesini bos buraxiram
    And login duymesini klikleyirem
    Then ekrana xeta mesaji gelir

  Scenario: her iki saheni bos buraxib giris etmeye calisiram  //5
    Given facebook sehifesine kecirem
    When username hissesini bos qoyuram
    And password hissesini bos qoyuram
    And login duymesine klikleyirem
    Then ekranda xeta mesaji gelir