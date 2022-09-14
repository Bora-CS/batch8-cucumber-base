Feature: Login
@smoke @pom
  Scenario: Login With POM
    Given [POM] user is on the homepage
    And [POM] user clicks on the login link button
    When [POM] user enters email and password
      | email                | password   |
      | clmusic333@gmail.com | Mymom0608& |
    And [POM] user clicks the submit login button
    Then [POM] user should be on the dashboard page
