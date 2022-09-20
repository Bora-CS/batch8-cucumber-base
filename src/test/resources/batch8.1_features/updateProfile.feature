Feature: User Profile
  I want to validate user profile

  @profile @api @sanity
  Scenario: Creat or Update user profile
    Given [API] I signIn by API by userName "batch8@gmail.com" and password "Test1234"
    When [API] user create or update the profile
      | company        | BoraTech                                                              |
      | website        | https://www.boraconsultingsolutions.com/                              |
      | location       | Annandale, VA                                                         |
      | status         | Test Automation Engineer                                              |
      | skills         | HTML, CSS, JavaScript, TypeScript, React.js, Node.js, AWS, Serverless |
      | githubusername | Muradil-Erkin                                                         |
      | bio            | I teach                                                               |
      | linkedin       | https://www.linkedin.com/in/muradil-erkin                             |
      | instagram      | https://www.instagram.com/muradilerkin                                |
    Then [API] validete the prifle for the user
