@nikki
Feature: NikkiRegister

  @smoke @ui
  Scenario: Nikki login
    Given nikki is on the login page
    When nikki enter userName "niex6666@gmail.com" and password "7918asd"
    And nikki click on the login page
    Then nikki should be validate to the "Dashboard"

  @nikki @regression @ui
  Scenario Outline: Nikki login
    Given nikki is on the bortach login page
    When nikki enter username -"<username>" and password - "<password>"
    And nikki click on login button
    Then I verify the login

    Examples: 
      | username           | password |
      | niex6666@gmail.com | 7918asd  |
