package com.numerlogy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.numerlogy.NumerologicalConstants;
import com.numerlogy.model.CalculateResponse;
import com.numerlogy.model.HebrewNumbers;
import com.numerlogy.model.LifeNumbers;
import com.numerlogy.model.Relationship;
@Service
public class NumerologyService {
	
	static int hebrewNminusOne=-1;
	static int hebrewN=-1;
	static int lnNminusOne=-1;
	static int lN=-1;
	
	public String findRelationship(int a, int b) {
		String actualRef = String.valueOf(a) + String.valueOf(b);
		return NumerologicalConstants.relationshipMatrix.get(actualRef);
	}
	

	private static int prepareHebrewNumber(String name) {
		ArrayList<Integer> LettersAsNumbers = new ArrayList<Integer>();
		for (int i = 0; i < name.length(); i++) {
			Character c = name.charAt(i);
			LettersAsNumbers.add(NumerologicalConstants.LetterToNumber.get(c.toString()));
		}
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		deepCopy(LettersAsNumbers, arrList);
		while (arrList.size() > 2) {
			ArrayList<Integer> newArrList = new ArrayList<Integer>();
			for (int i = 0; i < arrList.size() - 1; i++) {
				int justAddition = arrList.get(i) + arrList.get(i + 1);
				int actualNumber = process(justAddition);
				newArrList.add(actualNumber);
			}

			arrList = newArrList;
		}
		if (arrList.size() == 2) {
			printHebrewNumber(arrList);
			return process(arrList.get(0) + arrList.get(1));
		}
		return -1;
	}

	private static void deepCopy(ArrayList<Integer> lettersAsNumbers, ArrayList<Integer> arrList) {
		for (int val : lettersAsNumbers) {
			arrList.add(val);
		}

	}

	private static void printHebrewNumber(ArrayList<Integer> arrList) {
		hebrewNminusOne=Integer.parseInt(""+arrList.get(0) + arrList.get(1) );
		hebrewN=process(arrList.get(0) + arrList.get(1));
		System.out.println(
				"Hebrew Number: " + arrList.get(0) + arrList.get(1) + " - " + process(arrList.get(0) + arrList.get(1)));

	}

	private static int prepareLifeNumber(String name) {
		// TODO Auto-generated method stub
		int sumForName = 0;
		for (int i = 0; i < name.length(); i++) {
			Character c = name.charAt(i);
			sumForName += NumerologicalConstants.LetterToNumber.get(c.toString());
		}
		lnNminusOne=sumForName;
		lN=process(sumForName);
		System.out.println("Life Number: " + sumForName + " - " + process(sumForName));
		return process(sumForName);
	}

	

	public static int process(int number) {
		while (number / 10 != 0) {
			int sum = 0;
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			number = sum;
		}
		return number;
	}

	public  CalculateResponse getAllRelationships(String name, String dateOfBirth) {
		
		hebrewNminusOne=-1;
		hebrewN=-1;
		lnNminusOne=-1;
		lN=-1;
		
		name=preprocessName(name);
		CalculateResponse response = new CalculateResponse();
		int dob = 0;
		try {
			dob = Integer.parseInt(dateOfBirth);
			if (dateOfBirth.length() != 8)
				throw new NumberFormatException();
		} catch (NumberFormatException e) {
			return null;
		}
		int destiny = getDestiny(dob);
		int birthNumber = getBirthNumber(dateOfBirth);
		
		int hebrew=prepareHebrewNumber(name);
		int lifeNumber=prepareLifeNumber(name);
		
		
		response.setName(name);
		response.setDateOfBirth(dateOfBirth);
		
		response.setBirthNumber(birthNumber);
		response.setDestiny(destiny);
		
		HebrewNumbers hebrewNumbers=new HebrewNumbers();
		hebrewNumbers.setHebrewN(hebrewN);
		hebrewNumbers.setHebrewNminusOne(hebrewNminusOne);
		response.setHebrewNumbers(hebrewNumbers);
		
		LifeNumbers lifeNumbers=new LifeNumbers();
		lifeNumbers.setLN(lN);
		lifeNumbers.setLnNminusOne(lnNminusOne);
		response.setLifeNumbers(lifeNumbers);
		
		Relationship relationship=new Relationship(); 
		relationship.setBtoH(findRelationship(birthNumber, hebrew));
		relationship.setBtoL(findRelationship(birthNumber, lifeNumber));
		relationship.setDtoH(findRelationship(destiny,hebrew));
		relationship.setDToL(findRelationship(destiny,lifeNumber));
		response.setRelationship(relationship);
		
		
		return response;
	}

	
	private String preprocessName(String name) {
		name = name.toUpperCase();
		name=name.replaceAll("\\s", "");
		name=name.replaceAll("\\.", "");
		return name;
	}


	private static int getBirthNumber(String dateOfBirth) {
		return process(Integer.parseInt("" + dateOfBirth.charAt(0) + dateOfBirth.charAt(1)));
	}

	private static int getDestiny(int dob) {
		return process(dob);
	}
}
