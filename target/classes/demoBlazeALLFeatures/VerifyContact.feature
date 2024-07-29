Feature: Verify Contact link and New Message window



@test1
Scenario: Verify the New Message window

Given Open "<URL>" application
Then Verify Contact Functionality in header of the page
Then Click Contact and Verify the New Message window successfully

@test1
Scenario: Verify user able to type Email, Name,and send Message successfully

Given Open "<URL>" application
Then Click Contact
Then Enter valid Email and Name and Message and click send message
Then Verify Send Message button successfully
