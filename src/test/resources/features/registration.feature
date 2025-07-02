Feature: Registration Facebook

  @reg


  Scenario Outline: "<condition>" qeydiyat olmaga calisiram
    Given facebook sehifesine klikleyirem
    When Create new account hissesine klikleyirem
    And ad "<name>" hissesini doldururam
    And soyad "<surname>" hissesin doldururam
    And dogum tarixi "<date>" yaziram
    And cinsiyet "<genders>" secimini edirem
    And email "<mail>" hissesini yaziram
    And password "<psswd>" hissesini yaziram
    And Sign Up duymesini klikleyirem
    Then xeta mesaji "<errorMsgs>" ekranda gorunmelidir
    Examples:

      | condition             | name | surname | date       | genders | mail          | psswd     | errorMsgs                                                                                  |
      | adi bos buraxib       |      | aliyev  | Jan 5 1997 | Male    | +994557147854 | sakir1223 | What’s your name?                                                                          |
      | soyadi bos buraxib    | ali  |         | Feb 6 1998 | Female  | +994557147855 | sakir1224 | What’s your name?                                                                          |
      | cinsi bos buraxib     | ali  | aliyev  | Mar 7 1999 |         | +994557147856 | sakir1225 | Please choose a gender. You can change who can see this later.                             |
      | 2025 tarixle          | vali | aliyev  | Jul 5 2025 | Custom  | +994557147857 | sakir1223 | It looks like you entered the wrong info. Please be sure to use your real birthday.        |
      | parolu bos buraxib    | ali  | valiyev | Aug 4 1994 | Male    | +994557147858 |           | Enter a combination of at least six numbers, letters and punctuation marks (like ! and &). |
      | parolu uygunsuz yazib | vali | aliyev  | Sep 3 1993 | Male    | wwwwwwww      | sakir1223 | Please enter a valid mobile number or email address.                                       |

