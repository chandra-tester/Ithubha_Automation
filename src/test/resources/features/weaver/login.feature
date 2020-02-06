


Scenario: Testing with valid credentials
Given User navigates to login page
And Wellcome pop up should be closed
When User enters valid username 
And User enters valid password
Then User validates homepage of the website
	

Scenario Outline: Testing with invalid credentials
Given User navigates to home page
When User enters invalid Username <Username>
And  User enters invalid Password <Password>
Then User validates error message <errormsg> visible at portal

   Examples: 
      | Username    | Password | errormsg                                                  |
      | 0800123459  | 12345    | Either mobile no or pin is invalid                        |
      | 080012345   |   11111  | Please enter valid Mobile Number                          |
      | 0800123456  |          | * Please enter your Pin                                   |
      |             | 54321    | * Please enter your Mobile Number                         |                         
      |             |          | * Please enter your Mobile Number * Please enter your Pin |
