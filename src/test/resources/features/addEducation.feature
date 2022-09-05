  @addEducation
Feature: Add Education

  @test1
  Scenario: Adding education
    Given user is logged in
      | username                | password    |
      | henghuang1234@gmail.com | Hunter8090? |
    Then user should be navigated to the "Dashboard" page
    When user clicks the "Add Education" button
    Then user should be navigated to the "Add Your Education" page
    When user adds an education
      | school   | degree          | fieldofstudy    | from data | current | to   | description  |
      | BoraTech | Test automation | Test Automation | 05/07/22  | true    | null | This is fun! |
      | BoraTech | Test automation | Test Automation | 05/07/22  | true    | null | This is fun! |
      | BoraTech | Test automation | Test Automation | 05/07/22  | true    | null | This is fun! |
    Then user should see the success alert
