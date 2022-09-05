@posts
Feature: Posts

	@smoke @regression @ui
  Scenario: Create Post
    Given user is logged in
      | username                         | password |
      | muradil.erkin@boratechschool.com | Boratech |
    When user clicks on the "Posts" navigation link
    Then user should be navigated to the "Posts" page
    When user enters the post comment
      | comment                                          |
      | Cucumber automation is a lot more than you think |
    And user submits the post
    Then user should see the success alert
# 用同一个annotation的话。 名字在feature 里必须是一样的	,但是在step file 里面就跳过，不用写步骤了。
#Then user should be navigated to the "Posts" page
  #Then user should be navigated to the "Dashboard" page 

 