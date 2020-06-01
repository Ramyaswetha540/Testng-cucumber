Feature: guru99
Scenario Outline:  Guru99 login Test 

Given User is on login page
When title is guru99
Then user enter "<userid>" and enters "<password>"
Then user clicks on login button


Examples:
    | userid | password |
   |mngr251793| dEdyras |
    |mngr451793 |dEdyras |