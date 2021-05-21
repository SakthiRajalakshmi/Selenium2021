Feature: Login Functionality of Leaftabs application

Background:
@Given Open the chrome browser
@Given Load application URL "http://leaftaps.com/opentaps/control/main"


@regression
Scenario Outline: TC001_Login with positive data
Given Enter the username as <username>
Given Enter the password as <password>
When Click on login button
Then HomePage should be displayed

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|

@smoke
Scenario: TC002_Login with positive data
And Enter the password as 'crmsfa11'
When Click on login button
But Error messages displayed
