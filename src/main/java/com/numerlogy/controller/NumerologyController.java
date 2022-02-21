package com.numerlogy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numerlogy.model.CalculateRequest;
import com.numerlogy.model.CalculateResponse;
import com.numerlogy.service.NumerologyService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NumerologyController {

	@Autowired
	NumerologyService service;

	@PostMapping(value = "/calculate")
	public ResponseEntity<CalculateResponse> findRelationshipNameAndDOB(@RequestBody CalculateRequest calculateRequest) {
		CalculateResponse response= service.getAllRelationships(calculateRequest.getName(), calculateRequest.getDateOfBirth());
		if(response==null)
		return new ResponseEntity<CalculateResponse>(response,HttpStatus.BAD_REQUEST);
		return new ResponseEntity<CalculateResponse> (response,HttpStatus.OK);
	}
}
