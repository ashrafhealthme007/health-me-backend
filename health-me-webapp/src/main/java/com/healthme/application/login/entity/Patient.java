package com.healthme.application.login.entity;

public class Patient implements IPatient {

	private Long patientId;
	private String patientName;
	private Long bedNo;

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

}
