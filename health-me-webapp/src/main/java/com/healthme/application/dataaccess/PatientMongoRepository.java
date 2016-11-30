package com.healthme.application.dataaccess;

import org.springframework.data.repository.CrudRepository;

import com.healthme.application.entity.IPatient;

public interface PatientMongoRepository extends CrudRepository<IPatient, String> {
}