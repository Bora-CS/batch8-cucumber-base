@apiLogin
Feature: BoraTech Login

  @smoke @regression @api
  Scenario: API Login
    Given [API] user is logged in
      | username                         | password |
      | muradil.erkin@boratechschool.com | Boratech |
