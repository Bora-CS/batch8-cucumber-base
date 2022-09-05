Feature: Validate login functionality
This feature file will cintains all of the login/registration scenarios
@smoke @sanity @login
Scenario: User is able to login
Given I am on the homepage
And I click login button
Then Login page is displayed
And I enter useName"clmusic333@gmail.com"and password"Mymom0608&"
Then I am succefully logined
@smoke @test
Scenario: User is NOT able to login
Given I am on the homepage
And I click login button
Then Login page is displayed
And I enter wrong credential
|userName|password|
|test@t.com|wrongPassword|
Then I am NOT able to login


