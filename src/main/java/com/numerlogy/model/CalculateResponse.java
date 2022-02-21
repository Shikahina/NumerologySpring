package com.numerlogy.model;

import lombok.Data;

@Data
public class CalculateResponse {
	
private String name;
private String dateOfBirth;

private int birthNumber;
private int destiny;

private HebrewNumbers hebrewNumbers;
private LifeNumbers lifeNumbers;

private Relationship relationship;



}
