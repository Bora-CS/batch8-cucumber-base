@posts
Feature: Posts

	@smoke @regression @ui
  Scenario: Create Post
    Given user is logged in
      | username                         | password |
      |clmusic333@gmail.co | Mymom0608&|
    When user clicks on the "Posts" navigation link
    Then user should be navigated to the "Posts" page
    When user enters the post comment
      | comment                                          |
      | Cucumber automation is a lot more than you think!!! |
    And user submits the post
    Then user should see the success alert
