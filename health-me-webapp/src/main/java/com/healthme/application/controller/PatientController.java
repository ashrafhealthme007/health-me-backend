package com.healthme.application.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.healthme.application.dataaccess.PatientMongoRepository;
import com.healthme.application.dataaccess.PatientSearchRepository;
import com.healthme.application.entity.IPatient;
import com.healthme.application.entity.Patient;

@RestController
public class PatientController {

	@Autowired
	PatientMongoRepository patientRepository;

	@Autowired
	PatientSearchRepository patientSearchRepository;

	@RequestMapping("/homepath")
	public ModelAndView home(Model model) {
		List patientList = (List) patientRepository.findAll();
		model.addAttribute("patientList", patientList);
		return new ModelAndView("redirect:main.html");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<Patient> registerPatient(@Valid Patient patient, HttpServletRequest request, BindingResult result) {
		if(result.hasErrors()){
			new ResponseEntity<Patient>(patient, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		nameCreator(patient, request);
		patientRepository.save(patient);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}

	private void nameCreator(IPatient patient, HttpServletRequest request) {
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		StringBuilder nameBuilder = new StringBuilder();
		nameBuilder.append(fname).append(mname).append(lname);
		patient.setPatientName(nameBuilder.toString());
	}

	@RequestMapping("/search")
	public String search(Model model, @RequestParam String search) {
		model.addAttribute("patientList", patientSearchRepository.searchPatients(search));
		model.addAttribute("search", search);
		return "searchpatient";
	}

	@RequestMapping("/delete")
	public String deletePatients() {
		patientRepository.deleteAll();
		return "home";
	}

}
