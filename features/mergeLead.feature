Feature: MergeLead of Leaftabs application




@functional
Scenario Outline: MergeLead
When MergeLeads clicked
When Image is clicked
When New Window1 Opens
Given FirstName for MergeLead as <fiName>
When Click MergeLead1 Find Leads
Then Get the Name of the First Lead 
When The first Lead Clicked
Then Switch to the Merge Window
When Image2 is clicked
When New Window2 Opens
Given FirstName for MergeLead1 as <fMName>
When Click MergeLead2 Find Leads
When Click Merge
Then Switch to the previous window
When Click FindLeads for Merge
Given The LeadID
When Clicking the FindLeads Button
Then Validate the Page Information

Examples:

|fiName|fMName|
|'Sakthi'|'Hari'|
|'Sam'|'Avira'|
