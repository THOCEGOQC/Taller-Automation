#Author: Thocego

@Complete_test
Feature: I am Testing the inventory billiard test
  

  @test_1
  Scenario Outline: I am verify the login
    Given Start inventory page
    And I enter the user <user> and the password <password>
    When I click the login button
    Then I validate the succesful login with user <user>
		And I validate the succesful campus <campus>

    Examples: 
      |user			|password				|campus		| 
      |"Roy"		|"Prueba1234*"	|"Prueba"	|
      |"Thocego"|"Prueba1234"		|"Prueba"	|

