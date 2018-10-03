#Autor: Steven Arbelaez Palacio <sapalac@bancolombia.com.co>
Feature: Orange HRM Site
	As a web user
	I want to create an employee in Orange HRM Site
	to verify the correct creation in the Site

Scenario Outline: Register employee in Orange HRM Site
	Given that Steven needs to create an employee in Orange HRM Site
	When he registers the employee in the site
	|	firstname	|	lastname	|	employeeId	|	location	|	bloodGroup	|	hobbies	|
	|	<txtFirstname>	|	<txtLastname>	|	<txtEmployeeId>	|	<sltLocation>	|	<sltbloodGroup>	|	<txtHobbies>	|

	Then he should see the employee's information <txtEmployeeId> in the site
	
	Examples:
     |	txtFirstname	|	txtLastname	|	txtEmployeeId	|	sltLocation	|	sltbloodGroup	|	txtHobbies	|
	 |	Steven	|	Arbelaez	|	234567890123	|	Australian Regional HQ	|	A	|	Run	|
	
