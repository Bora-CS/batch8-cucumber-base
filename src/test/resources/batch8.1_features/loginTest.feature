Feature: Validate login functionality
	This featuer file will contains all of the login/registration scenarios
	Background:
		Given I am on the homepage
		And Click login button
		Then Login page is displayed
	
	
	
	
	@smoke @sanity @login @ui
	Scenario: user is able to login
<<<<<<< HEAD
		And I enter userName "shuqin3232331@gmail.com" and password "Tony3232331!"
		Then I am succefully logined
		
#	@smoke @test
#	Scenario: user is NOT able to login
#
#		And I enter wrong credential
#				| test1@t.com	| wrongPassword |
#				| test2@t.com	| wrongPassword |
#				| test3@t.com	| wrongPassword |
#				| test4@t.com	| wrongPassword |
#		Then I am NOT able to login
#		
#		@smoke
#	Scenario: user is NOT able to login
#		And I enter wrong credential
#				| test1@t.com	| wrongPassword |
=======
		And I enter userName "batch8@gmail.com" and password "Test1234"
		Then I am succefully logined
		
	@smoke @test @ui
	Scenario: user is NOT able to login
		And I enter userName "batch8@gmail.com" and password "wrongPassword"
		Then I am NOT able to login
		
		@smoke @ui
	Scenario: user is NOT able to login
		And I enter userName "wrongEmail" and password "Test1234"
		Then I am NOT able to login
>>>>>>> batch8.1_Master
