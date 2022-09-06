Feature: API test
  I want to use this template for my feature file
 	Background:  
 		Given [API] I signIn by API by userName "batch8@gmail.com" and password "Test1234"
 	

  @tag1
  Scenario: add expirence by API
		Then [API] Add a experence for the user
			|company|title|location|from      |to        |current |description                   |
			|Bora	  |SDET |VA      |01/01/2021|01/01/2022|false   |I don't want to write anything|
		Then [API] valide this expirence add into account
		
	@tag1
  Scenario: add education by API
		Then [API] Add a education for the user
			|company|title|location|from      |to        |current |description                   |
			|Bora	  |SDET |VA      |01/01/2021|01/01/2022|false   |I don't want to write anything|
		Then [API] valide this education add into account
		
		
  @tag1
  Scenario: negative - add expirence by API
		Then [API] Add a experence for the user
			|company|title|location|from      |to        |current |description                   |
			|Bora	  |SDET |VA      |01/01/2021|01/01/2022|false   |I don't want to write anything|
		Then [API] valide this expirence is NOT add into account
		
	@tag1
  Scenario: negative - add education by API
		Then [API] Add a education for the user
			|company|title|location|from      |to        |current |description                   |
			|Bora	  |SDET |VA      |01/01/2021|01/01/2022|false   |I don't want to write anything|
		Then [API] valide this education is NOT add into account
		
				
		