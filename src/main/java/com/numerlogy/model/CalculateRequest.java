package com.numerlogy.model;

import lombok.Data;

@Data
public class CalculateRequest {
	private String name;
	private String dateOfBirth;

	public CalculateRequest(String name, String dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

}
