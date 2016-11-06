package com.healthme.application.entity;

import java.io.Serializable;

public interface IPatient extends Serializable {

	Long getPatientId();

	String getPatientName();

	Long getBedNo();

	void setBedNo(Long bedNo);

}