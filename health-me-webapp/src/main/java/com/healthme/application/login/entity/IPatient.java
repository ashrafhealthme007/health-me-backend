package com.healthme.application.login.entity;

import java.io.Serializable;

public interface IPatient extends Serializable {

	Long getPatientId();

	String getPatientName();

	Long getBedNo();

	void setBedNo(Long bedNo);

}