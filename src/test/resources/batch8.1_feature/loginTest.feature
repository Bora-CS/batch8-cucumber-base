Feature: Validate Login Functionality
  this feature file will contains all of the login/registration related scenarios

  @smoke @ui
  Scenario: User is able to login
    Given user is on the boratech login page 
    And I enter username"carter4902@gmail.com" and password "@Ccc8923230"
    Then I am succefully logged in
