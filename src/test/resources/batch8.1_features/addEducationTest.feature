
@tag
Feature: add Education
  @tag1
  Scenario: add a New Education
    Given user is login in 
     |username                 | password  |
     |zhichen20110128@gmail.com| Chen12345@|
   	Then user should be land in "Dashboard" page
   	When user click "Add Education" button
   	Then user should be land in "Add Your Education" page
   	