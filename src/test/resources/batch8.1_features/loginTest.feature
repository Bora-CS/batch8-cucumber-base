Feature: Validate login functionality

	This featuer file will contains all of the login/registration scenarios
	Background:
		Given I am on the homepage
		And Click login button
		Then Login page is displayed
	
	
	
	
	@smoke @sanity @login @ui_batch8_1
	Scenario: user is able to login
		And I enter userName "batch8@gmail.com" and password "Test1234"
		Then I am succefully logined
		
	@smoke @test @ui_batch8_1
	Scenario: user is NOT able to login
		And I enter userName "batch8@gmail.com" and password "wrongPassword"
		Then I am NOT able to login
		
		@smoke @ui_batch8_1
	Scenario: user is NOT able to login
		And I enter userName "wrongEmail" and password "Test1234"
		Then I am NOT able to login
		
		@sanity @ui_batch8_1
	Scenario: Add Education for a user
		And I enter userName "batch8@gmail.com" and password "Test1234"
		And I add a education 
			|school|degree|field|from      |to        |Description                   |
			|Bora	 |No    |CS   |01/01/2021|01/01/2022|I don't want to write anything|
		Then I verify the education is been added
		
		@wip @ui_batch8_1
	Scenario: Add Experence for a user
		And I enter userName "batch8@gmail.com" and password "Test1234"
		And [API] I signIn by API by userName "batch8@gmail.com" and password "Test1234"
		Then [API] Add a experence for the user
			|company|title|location|from      |to        |current |description                   |
			|Bora	  |SDET |VA      |01/01/2021|01/01/2022|false   |I don't want to write anything|
		Then Validate the expirence in the UI
		
		
		
		
		
		
		
		
		
