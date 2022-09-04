@apiAddEducation
Feature: BoraTech API Add Education

  @regression @negativeTest @api
  Scenario: API Add Experience Unhappy Path
    Given [API] user is logged in
      | username                         | password |
      | muradil.erkin@boratechschool.com | Boratech |
    When [API] user sets the endpoint and the header to add an "education"
    And [API] user calls the PUT request with education data with missing information
      | _id                      | school | degree | fieldofstudy | from       | current | to         | description         |
      | 62d498f89473b00017ca7e1f |        |        | QA           | 08/11/2020 |         | 05/12/2021 | learning to be a QA |
    Then [API] user should fail and get status code 400
    And [API] user gets 2 error messages: "School is required, Degree is required"
