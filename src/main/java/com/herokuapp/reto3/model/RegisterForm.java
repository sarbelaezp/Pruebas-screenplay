package com.herokuapp.reto3.model;

public class RegisterForm {

	private String name, lastname, phone, idType, idDoctorNumber, idPatientNumber, date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdDoctorNumber() {
		return idDoctorNumber;
	}

	public void setIdDoctorNumber(String idDoctorNumber) {
		this.idDoctorNumber = idDoctorNumber;
	}

	public String getIdPatientNumber() {
		return idPatientNumber;
	}

	public void setIdPatientNumber(String idPatientNumber) {
		this.idPatientNumber = idPatientNumber;
	}


}
