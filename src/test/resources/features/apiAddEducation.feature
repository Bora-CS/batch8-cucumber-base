@api
Feature: Add Education API

@happyPath
Scenario: Add Education API Happy Path
Given [API] user is logged in
|suername|password|
|niex6666@gmail.com|7918asd|
when [API] user adds an deucation
|school|                 degree|fieldofstudy|from|to|description|
|BoraTech|Test automation degree|Test A|