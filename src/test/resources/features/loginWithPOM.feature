Feature: Login
<<<<<<< HEAD
  
  Scenario: Login With POM
  Given [POM] user is on the homepage
  And [POM] user click on the login link button
  When [POM] user enters email  and the password 
  |email             |password|
  |niex6666@gmail.com|7918asd|
  And [POM] user clicks on submit login button
  Then [POM] user should be on the dashborad page
=======

  Scenario: Login With POM
    Given [POM] user is on the homepage
    And [POM] user clicks on the login link button
    When [POM] user enters email and password
      | email              | password |
      | niex6666@gmail.com | 7918asd  |
    And [POM] user clicks on submit login button
    Then [POM] user should be on the dashboard page
>>>>>>> master
