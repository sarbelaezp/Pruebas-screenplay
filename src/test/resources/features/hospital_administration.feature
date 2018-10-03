#Autor: Steven Arbelaez Palacio <sapalac@bancolombia.com.co>
Feature: Orange HRM Site
	As a patient
I want to do a medical request
Through the Hospital Administration System


Scenario Outline: Register a Doctor in the system
	Given that Carlos needs to register a new doctor
	|	listGroup	|
	|	<lstListGroup>	|
	
	When he registers a doctor in the application
	|	name	|	lastname	|	phone	|	idType	|	idDoctorNumber	|
	|	<txtName>	|	<txtLastname>	|	<txtPhone>	|	<lstIdType>	|	<txtIdNumber>	|

	Then he should see the message in the screen Datos guardados correctamente.
	
	Examples:
     |	lstListGroup	|	txtName	|	txtLastname	|	txtPhone	|	lstIdType	|	txtIdNumber	|	
	 |	Agregar Doctor	|	Steven	|	Arbelaez	|	1234567	|   Cédula de ciudadanía  	|	1234567890	|
	
Scenario Outline: Register a Patient in the system
	Given that Carlos needs to register a new patient
	|	listGroup	|
	|	<lstListGroup>	|
	
	When he registers a patient in the application
	|	name	|	lastname	|	phone	|	idType	|	idPatientNumber	|
	|	<txtName>	|	<txtLastname>	|	<txtPhone>	|	<lstIdType>	|	<txtIdNumber>	|

	Then he should see the message in the screen Datos guardados correctamente.
	
	Examples:
     |	lstListGroup	|	txtName	|	txtLastname	|	txtPhone	|	lstIdType	|	txtIdNumber	|	
	|	Agregar Paciente	|	Juan	|	Garcia	|	1234567	|   Cédula de ciudadanía  	|	12345678	|
#	
#	@Date
	Scenario Outline: Register a Patient in the system
	Given that Carlos needs to register a new date
	|	listGroup	|
	|	<lstListGroup>	|
	
	When he registers a date in the application
	|	idPatientNumber	| IdDoctorNumber	|
	|	<txtIdNumber>	|	<txtIdNumber>	|

	Then he should see the message in the screen Datos guardados correctamente.
	
	Examples:
     |	lstListGroup	|	txtIdNumber	|	idPatientNumber	|
	 |	Agendar Cita	|	1234567890	|	12345678901	|
