package com.healthme.application.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public interface IPatient extends Serializable {

	Long getPatientId();

	String getPatientName();

	Long getBedNo();

	void setBedNo(Long bedNo);

	void setPatientName(String patientName);

	void setPatientId(Long patientId);

	void setConsultationDate(Date consultationDate);

	Date getConsultationDate();

	void setListOfDiseases(List<String> listOfDiseases);

	List<String> getListOfDiseases();

	void setAddress(String address);

	String getAddress();

	void setDependentPhoneNumber(Long dependentPhoneNumber);

	Long getDependentPhoneNumber();

	void setPatientEmail(String patientEmail);

	String getPatientEmail();

	void setPatientPhoneNumber(Long patientPhoneNumber);

	Long getPatientPhoneNumber();

	void setUhid(String uhid);

	String getUhid();

	void setOccupation(String occupation);

	String getOccupation();

	void setDependentName(String dependentName);

	String getDependentName();

	void setMartialStatus(String martialStatus);

	String getMartialStatus();

	void setBloodGroup(String bloodGroup);

	String getBloodGroup();

	void setSex(String sex);

	String getSex();

	void setConsultantName(String consultantName);

	String getConsultantName();

	void setDob(Date dob);

	Date getDob();

}