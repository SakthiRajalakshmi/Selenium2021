Feature: Delete of Leaftabs application




Scenario: DeleteLead
When FindLeads clicked
When Phone is clicked
Given Enter the phone number as "99"
When click FindLeads
Then Get the Lead ID
When Click first LeadID
When Delete the LeadID
When FindLeads clicked again
Given Send the LeadID
When Click the FindLeads button
Then Check for Text displayed

