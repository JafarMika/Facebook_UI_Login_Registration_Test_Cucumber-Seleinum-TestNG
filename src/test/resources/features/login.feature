Feature: Login Facebook

  @login
  Scenario Outline: "<condition>" ile giris etmeye calisiram
    Given men facebook ana sehifesine gedirem
    When ad "<name>" hissesini yaziram
    And parol "<passkey>" hissesini yaziram
    And login duymesine sixiram
    Then ekranda "<errors>" mesaji gorunur

    Examples:
      | condition    | name                 | passkey     | errors                                                                                              |
      | dogru deyer  | +994515467891        | sakir123    | The mobile number you entered isn’t connected to an account. Find your account and log in.          |
      | yalnis ad    | username@mail.ru     | Sakir.123   | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |
      | bos ad       | ""                   | dogru_parol | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |
      | bos soyad    | dogru_username@bk.ru | ""          | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |
      | bos ad,soyad | ""                   | ""          | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |

