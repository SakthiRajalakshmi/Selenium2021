Feature: EditLead of Leaftabs application




@functional
Scenario Outline: EditLead
When FindLeads clicked
When Phone is clicked
Given Enter the phone number as <mobileNo>
When click FindLeads
When Click first LeadID
When Click Edit Lead
Given Company name as <companyName>
When Click editSubmit

Examples:

|mobileNo|companyName|
|99|TCS|
|999|TestLeaf|
