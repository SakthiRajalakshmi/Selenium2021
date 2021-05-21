Feature: Duplicate of Leaftabs application




@functional
Scenario Outline: DuplicateLead
When FindLeads clicked
When Phone is clicked
Given Enter the phone number as <mobileNo>
When click FindLeads
When Click first LeadID
When Click Duplicate Lead
When Click DupSubmit button

Examples:

|mobileNo|
|99|
|999|
