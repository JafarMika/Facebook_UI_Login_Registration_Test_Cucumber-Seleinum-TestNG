Feature: Login Facebook

  @login
  Scenario Outline: "<condition>" ile giris etmeye calisiram
    Given men facebook ana sehifesine gedirem
    When ad "<name>" hissesini yaziram
    And parol "<passkey>" hissesini yaziram
    And login duymesine sixiram
    Then ekranda "<errors>" mesaji gorunur

    Examples:
      | condition        | name                         | passkey    | errors                                                                                              |
      | yalnis parol     | +994515467891                | sakir123.. | Invalid username or password                                                                        |
      | yalnis ad        | cefer.mikayilzade.95@.ru     | Sakir.123  | Invalid username or password                                                                        |
      | bos ad           |                              | Sakir.123  | Invalid username or password                                                                        |
      | bos parol        | cefer.mikayilzade.95@mail.ru |            | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |
      | bos ad,bos parol |                              |            | The email or mobile number you entered isn’t connected to an account. Find your account and log in. |

