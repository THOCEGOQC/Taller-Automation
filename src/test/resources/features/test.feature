#Author: Thocego

@Complete_test
Feature: I am Testing the inventory billiard test
  

  @test_1
  Scenario Outline: I am verify the login
    Given Start inventory page
    And I enter the user <user> and the password <password>
    When I click the login button
    Then I validate the succesful login


    Examples: 
      | user  	| password 			| 
      | Brayan 	| Prueba1234 		| 
      | Jorge 	| Jorge2023*		|

