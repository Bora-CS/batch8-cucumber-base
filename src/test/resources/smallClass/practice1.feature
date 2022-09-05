Feature: Validate loging Functionality

  @smoke
  Scenario: User is able to login
    Given user is on the boratech login page
    When user enter username - "niex6666@gmail.com" and password - "7918asd"
    And user clicks on the login button
    Then user should be navigated to the "Dashborad" page

  #@smoke
  #Scenario Outline: User able to login
    #Given user is on the boratech login page
    #When user enter user name - "<username>" and password - "<password>"
    #And user clicks on the login button
    #Then user should be navigated to the "Dashborad" page
