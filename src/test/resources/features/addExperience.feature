@addExperience
Feature: Add Experience

  @smoke @regression @ui
  Scenario: Add a New Experience
    Given user is logged in
      | username                         | password |
      | muradil.erkin@boratechschool.com | Boratech |
    Then user should be navigated to the "Dashboard" page
    Then user clicks the "Add Experience" button
    Then user should be navigated to the "Add An Experience" page
    When user adds an experience
      | jobtitle | company   | location      | from     | current | to | description           |
      | Cashier  | Mcdonalds | Annandale, VA | 09012021 | true    |    | I donot like this job |
    Then user should see the success alert

  @api @smoke @regression @unhappy
  Scenario: [API] Add Expereience Unhappy Path
    Given [API] the user has aquired the token using the following credentials:
      | username               | password |
      | lixiasun2000@gmail.com | Lsun1688 |
    Then [API] user adds an experience with incomplete field(s)
      | jobtitle | company | location      | from | current | to         | description            |
      |          |         | Annandale, VA |      | false   | 05/05/2019 | I do not like this job |
    Then [API] user is unable to add experience because they recieved 3 error(s)
      | Title is required     |
      | Company is required   |
      | From date is required |
    And [API] user recieves status code 400
