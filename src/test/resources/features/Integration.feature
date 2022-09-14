Feature: Integation

  Scenario: AdEducation API to UI
    Given [API] user is logged in
      | username             | password   |
      | clmusic333@gmail.com | Mymom0608& |
    Then [API] user adds an education
      | school   | degree                 | fieldofstudy    | from       | current | to | description  |
      | BoraTech | Test automation degree | Test Automation | 2022/05/07 | true    |    | This is fun! |
    And user is logined in
      | email                | password   |
      | clmusic333@gmail.com | Mymom0608& |
    Then user shuld see the  newly added	education credential
   