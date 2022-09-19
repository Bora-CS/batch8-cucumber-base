@login
Feature: BoraTech Login

  @smoke @regression @ui
  Scenario: Login Happy Path
    Given user is on the boratech login page
    When user enters username - "niex6666@gmail.com" and password - "7918asd"
    And user clicks on the login button
    Then user should be navigated to the "Dashboard" page

  @regression @ui
  Scenario Outline: Login Happy Path
    Given user is on the boratech login page
    When user enters username - "<username>" and password - "<password>"
    And user clicks on the login button
    Then user should be navigated to the "Dashboard" page

    Examples: 
      | username                     | password   |
      | niex6666@gmail.com           | 7918asd    |
      | yadikaeryashengdmv@gmail.com | yadang0306 |

  @smoke @regression @api
  Scenario: API Login
    Given [API] user is logged in
      | email              | password |
      | niex6666@gmail.com | 7918asd  |
