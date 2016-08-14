package com.healthme.application.login.service;

import com.healthme.application.login.entity.Patient;

public interface ILoginServcie {

    boolean isUserValidUser(Patient patient);
}
