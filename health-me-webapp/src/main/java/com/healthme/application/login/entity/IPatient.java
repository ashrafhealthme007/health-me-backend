package com.healthme.application.login.entity;

import java.io.Serializable;

public interface IPatient extends Serializable {

	Long getPatientId();

	void setPatientId(Long patientId);

	String getPatientName();

	void setPatientName(String patientName);

	Long getBedNo();

	void setBedNo(Long bedNo);

}