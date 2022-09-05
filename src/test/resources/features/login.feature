@login
Feature: BoraTech Login

  @smoke @regression @ui
  Scenario: Login Happy Path
    Given user is on the boratech login page
    When user enters username - "zhichen20110128@gmail.com" and password - "Chen12345@"
    And user clicks on the login button
    Then user should be navigated to the "Dashboard" page

  @regression @ui
  Scenario Outline: Login Happy Path
    Given user is on the boratech login page
    When user enters username - "<username>" and password - "<password>"
    And user clicks on the login button
    Then user should be navigated to the "Dashboard" page

    Examples: 
      | username                         | password   |
      | muradil.erkin@boratechschool.com | Boratech   |
      | yadikaeryashengdmv@gmail.com     | yadang0306 |

  @smoke @regression @api
  Scenario: API Login
    Given [API] user is logged in
      | username                         | password |
      | muradil.erkin@boratechschool.com | Boratech |
