@ApiAddExperience
Feature: add experience

  @smoke @regression @api @unhappy
  Scenario: add experience unhappy
    Given [API] user is logged in
      | username               | password |
      | lixiasun2000@gmail.com | Lsun1688 |
    Then user enters incorrect add experience inputs
      | jobtitle | company | from |
      | null     | null    | null |
    Then user gets back error(s)
      | title             | company             | from                  |
      | Title is required | Company is required | From date is required |
