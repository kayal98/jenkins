Feature: Login to TestMe App
Scenario Outline: Validate Login
* user launches chrome 
* user navigates to TestMe App
* user clicks on signin link
* user enters username as "<Username>" in un 
* user enters password as "<Password>" in pw 
* user clicks on Login button

Examples:
|Username|Password|
|kayal vizhi|pass1234|

