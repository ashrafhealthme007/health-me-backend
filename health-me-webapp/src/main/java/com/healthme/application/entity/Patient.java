package com.healthme.application.entity;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PATIENT")
public class Patient implements IPatient {

	private Long patientId;
	private String patientName;
	private Date dob;
	private Long bedNo;
	private String sex;
	private String bloodGroup;
	private String martialStatus;
	private String dependentName;
	private String occupation;
	private String uhid;
	private Long patientPhoneNumber;
	private String patientEmail;
	private Long dependentPhoneNumber;
	private String address;
	private List<String> listOfDiseases;
	private Date consultationDate;
	private String consultantName;

	public Patient() {

	}

	public Patient(long patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mysample.healthme.IPatient#getPatientId()
	 */
	@Override
	public Long getPatientId() {
		return patientId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mysample.healthme.IPatient#getPatientName()
	 */
	@Override
	public String getPatientName() {
		return patientName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mysample.healthme.IPatient#getBedNo()
	 */
	@Override
	public Long getBedNo() {
		return bedNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mysample.healthme.IPatient#setBedNo(java.lang.Long)
	 */
	@Override
	public void setBedNo(Long bedNo) {
		this.bedNo = bedNo;
	}

	@Override
	public String getSex() {
		return sex;
	}

	@Override
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String getBloodGroup() {
		return bloodGroup;
	}

	@Override
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String getMartialStatus() {
		return martialStatus;
	}

	@Override
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	@Override
	public String getDependentName() {
		return dependentName;
	}

	@Override
	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}

	@Override
	public String getOccupation() {
		return occupation;
	}

	@Override
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String getUhid() {
		return uhid;
	}

	@Override
	public void setUhid(String uhid) {
		this.uhid = uhid;
	}

	@Override
	public Long getPatientPhoneNumber() {
		return patientPhoneNumber;
	}

	@Override
	public void setPatientPhoneNumber(Long patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}

	@Override
	public String getPatientEmail() {
		return patientEmail;
	}

	@Override
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	@Override
	public Long getDependentPhoneNumber() {
		return dependentPhoneNumber;
	}

	@Override
	public void setDependentPhoneNumber(Long dependentPhoneNumber) {
		this.dependentPhoneNumber = dependentPhoneNumber;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public List<String> getListOfDiseases() {
		return listOfDiseases;
	}

	@Override
	public void setListOfDiseases(List<String> listOfDiseases) {
		this.listOfDiseases = listOfDiseases;
	}

	@Override
	public Date getConsultationDate() {
		return consultationDate;
	}

	@Override
	public void setConsultationDate(Date consultationDate) {
		this.consultationDate = consultationDate;
	}

	@Override
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	@Override
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public Date getDob() {
		return dob;
	}

	@Override
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String getConsultantName() {
		return consultantName;
	}

	@Override
	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}

}
