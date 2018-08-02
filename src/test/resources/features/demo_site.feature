#Autor: Steven Arbelaez Palacio <sapalac@bancolombia.com.co>
Feature: Automation Demo Site
	As a web user
	I want to register in Automation Demo Site
	to verify the correct learning of Screenplay

Scenario Outline: Register user in Automation Demo Site
	Given that Steven wants to access to Automation Demo Site
	When he registers in the site
	|	name	|	lastname	|	email	|	phone	|	country	|	year	|	month	|	day	|	password	|	confirmPassword	|
	|	<txtName>	|	<txtLastname>	|	<txtEmail>	|	<txtPhone>	|	<lstCountry>	|	<lstYear>	|	<lstMonth>	|	<lstDay>	|	<txtPassword>	|	<txtConfPassword>	|
	Then he should see the text  - Double Click on Edit Icon to EDIT the Table Row. in the screen
	
	Examples:
     |	txtName	|	txtLastname	|	txtAddress	|	txtEmail	|	txtPhone	|	rdbGender	|	lstHobbies	|	lstLanguages	|	lstSkills	|	lstCountry	|	lstSelectCountry	|	lstYear	|	lstMonth	|	lstDay	|	txtPassword	|	txtConfPassword	|
	 |	Steven	|	Arbelaez	|	Carrera no existe 3 # 33 - 34	|	sarbelaezp123@choucairtesting.com	|	3195611218	|	Male	|	Movies	|	Danish	|	Android	|	Colombia	|	Australia	|	1993	|	November	|	21	|	Sap1234	|	Sap1234	|
	
