Feature: Create of Leaftabs application




@functional
Scenario Outline: CreateLead
When Click the CreateLead link
Then CreateLead page displayed
Given Enter the company Name as <cName>
Given Enter the first Name as <fName>
Given Enter the last Name as <lName>
When Click submit button
Then Lead is created

Examples:
|cName|fName|lName|
|'TCS'|'Avira'|'V'|
|'Wipro'|'Kanna'|'S'|

