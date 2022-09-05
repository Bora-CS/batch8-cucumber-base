Feature: Validate loging functionality
  This feature file will contains all  of the login/registration related scenraios
Background:
Given I am on the homepage
    And Click login button
    Then Login page is displayed

@smoke @sanity @login
  Scenario: User is able to login
    
    And I enter userName "niex6666@gmail.com" and password "7918asd"
    Then I am succefully logined

@smoke
Scenario: user is NOTable to login
  
    And I enter wrong credentila
    |userName|password|
    |test@t.com|wrongPassword|
    
    Then I am NOT able to login
    
@smoke
Scenario: user is NOT able to login
	And I enter wrong credential
	    |test@t.com|wrongPassword|

    
    