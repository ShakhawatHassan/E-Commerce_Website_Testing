Feature: this is feature for login for

Scenario Outline: User should not be able to login using invalid credential

Given User is on UPS login page  
When User entered invalid "<username>" and "<password>"
Then User should not be able to login 

Examples:
|username|password|
|john	 |john123|
|Micheal |abc123|