Feature: This is for verify login


@test1
Scenario: VERIFY USER CAN LOGIN 

Given Open "<URL>" application
Then Click LOGIN link
Then Enter valid Username and Password and Click login
Then Verify user can login

