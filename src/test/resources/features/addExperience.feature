@api
Feature: Add Experience

  @test1
  Scenario: Adding exPerience
   Given user is logged in
      | username             | password   |
      | clmusic333@gmail.com | Mymom0608& |
    Then user should navigated to the "Deshboard" page
    When user clicks the "Add Experience" button
    Then user should be navigated to the "Add An Experience" page
    When user adds an experience
      | title      | company | location | from       | current | to   | description      |
      | Supervisor | MGM     | Maryland | 11/16/2016 | ture    | null | it is a easy job |
    Then user should see the success alert
