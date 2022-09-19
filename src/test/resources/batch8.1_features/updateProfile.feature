
Feature: User profile
  I want to validate user profile

@profile @sanit
  Scenario: Creat or Update user profile
    Given [API] I signIn by API by userName "niex6666@" and passowrd "7918asd"
    When [API] user create or update the profile
    Then [API] Validete the prifle for the user
    
    
    Scenario outline:
    
    
    
