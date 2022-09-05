Feature: Validate login functionality
	This featuer file will contains all of the login/registration scenarios
	Background:
		Given I am on the homepage
		And Click login button
		Then Login page is displayed
	
	
	
	
	@smoke @sanity @login @ui
	Scenario: user is able to login
		And I enter userName "batch8@gmail.com" and password "Test1234"
		Then I am succefully logined
		
	@smoke @test @ui
	Scenario: user is NOT able to login

		And I enter wrong credential
				| test1@t.com	| wrongPassword |
				| test2@t.com	| wrongPassword |
				| test3@t.com	| wrongPassword |
				| test4@t.com	| wrongPassword |
		Then I am NOT able to login
		
		@smoke @ui
	Scenario: user is NOT able to login
		And I enter wrong credential
				| test1@t.com	| wrongPassword |