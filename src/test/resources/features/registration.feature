Feature: Registration Facebook

  Scenario: qeydiyat olmaga calisiram //1
    Given facebook sehifesine klikleyirem
    When Create new account hissesine klikleyirem
    And firstname hissesini bos saxlayiram
    And lastname hissesine istifadeci adini yaziram
    And dogum tarixi gun yaziram
    And dogum tarixi ay yaziram
    And dogum tarixi il yaziram
    And cinsiyet secimini edirem
    And email hissesine istifadeci emailini yaziram
    And password hissesine parol yaziram
    And signup duymesini klikleyirem
    Then xeta mesaji ekranda gorunmelidir