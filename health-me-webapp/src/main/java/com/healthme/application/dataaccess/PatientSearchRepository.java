package com.healthme.application.dataaccess;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthme.application.entity.Patient;


@Repository
public class PatientSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Patient> searchPatients(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("patientName").regex(text, "i"), 
									Criteria.where("uhid").regex(text, "i"), 
									Criteria.where("patientId").regex(text, "i"),
									Criteria.where("patientPhoneNumber").regex(text, "i"),
									Criteria.where("consultationDate").regex(text, "i"),
									Criteria.where("consultationName").regex(text, "i"))
						), Patient.class);
	}
	
}
