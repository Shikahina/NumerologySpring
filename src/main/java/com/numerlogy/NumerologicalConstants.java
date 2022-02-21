package com.numerlogy;

import java.util.HashMap;
import java.util.Map;

public class NumerologicalConstants {
	static public Map<String, String> relationshipMatrix;
	static String natpu = "BEST";
	static String pagai = "BAD";
	static String samam = "OKAY";
	static String neutral = "NOTOKAY";
	static
    {
		relationshipMatrix = new HashMap<>();
		relationshipMatrix.put("11", natpu);
		relationshipMatrix.put("12", natpu);
		relationshipMatrix.put("13", natpu);
		relationshipMatrix.put("14", neutral);
		relationshipMatrix.put("15", samam);
		relationshipMatrix.put("16", pagai);
		relationshipMatrix.put("17", samam);
		relationshipMatrix.put("18", pagai);
		relationshipMatrix.put("19", natpu);

		relationshipMatrix.put("21", natpu);
		relationshipMatrix.put("22", natpu);
		relationshipMatrix.put("23", samam);
		relationshipMatrix.put("24", pagai);
		relationshipMatrix.put("25", natpu);
		relationshipMatrix.put("26", samam);
		relationshipMatrix.put("27", pagai);
		relationshipMatrix.put("28", samam);
		relationshipMatrix.put("29", samam);

		relationshipMatrix.put("31", natpu);
		relationshipMatrix.put("32", natpu);
		relationshipMatrix.put("33", natpu);
		relationshipMatrix.put("34", pagai);
		relationshipMatrix.put("35", pagai);
		relationshipMatrix.put("36", pagai);
		relationshipMatrix.put("37", pagai);
		relationshipMatrix.put("38", samam);
		relationshipMatrix.put("39", natpu);

		relationshipMatrix.put("41", pagai);
		relationshipMatrix.put("42", pagai);
		relationshipMatrix.put("43", pagai);
		relationshipMatrix.put("44", natpu);
		relationshipMatrix.put("45", natpu);
		relationshipMatrix.put("46", natpu);
		relationshipMatrix.put("47", natpu);
		relationshipMatrix.put("48", natpu);
		relationshipMatrix.put("49", neutral);

		relationshipMatrix.put("51", natpu);
		relationshipMatrix.put("52", pagai);
		relationshipMatrix.put("53", samam);
		relationshipMatrix.put("54", natpu);
		relationshipMatrix.put("55", natpu);
		relationshipMatrix.put("56", natpu);
		relationshipMatrix.put("57", natpu);
		relationshipMatrix.put("58", samam);
		relationshipMatrix.put("59", samam);

		relationshipMatrix.put("61", pagai);
		relationshipMatrix.put("62", pagai);
		relationshipMatrix.put("63", samam);
		relationshipMatrix.put("64", natpu);
		relationshipMatrix.put("65", natpu);
		relationshipMatrix.put("66", natpu);
		relationshipMatrix.put("67", natpu);
		relationshipMatrix.put("68", natpu);
		relationshipMatrix.put("69", samam);

		relationshipMatrix.put("71", samam);
		relationshipMatrix.put("72", samam);
		relationshipMatrix.put("73", pagai);
		relationshipMatrix.put("74", neutral);
		relationshipMatrix.put("75", natpu);
		relationshipMatrix.put("76", natpu);
		relationshipMatrix.put("77", natpu);
		relationshipMatrix.put("78", samam);
		relationshipMatrix.put("79", samam);

		relationshipMatrix.put("81", pagai);
		relationshipMatrix.put("82", pagai);
		relationshipMatrix.put("83", samam);
		relationshipMatrix.put("84", natpu);
		relationshipMatrix.put("85", natpu);
		relationshipMatrix.put("86", natpu);
		relationshipMatrix.put("87", natpu);
		relationshipMatrix.put("88", neutral);
		relationshipMatrix.put("89", pagai);

		relationshipMatrix.put("91", natpu);
		relationshipMatrix.put("92", natpu);
		relationshipMatrix.put("93", natpu);
		relationshipMatrix.put("94", pagai);
		relationshipMatrix.put("95", natpu);
		relationshipMatrix.put("96", pagai);
		relationshipMatrix.put("97", pagai);
		relationshipMatrix.put("98", pagai);
		relationshipMatrix.put("99", natpu); //// ??????????????

    }
	
	
	
	
	
	
	
	public static Map<String, Integer> LetterToNumber ;
	static {
		LetterToNumber=new HashMap<String, Integer>();
		LetterToNumber.put("A", 1);
		LetterToNumber.put("I", 1);
		LetterToNumber.put("J", 1);
		LetterToNumber.put("Q", 1);
		LetterToNumber.put("Y", 1);

		LetterToNumber.put("B", 2);
		LetterToNumber.put("K", 2);
		LetterToNumber.put("R", 2);

		LetterToNumber.put("C", 3);
		LetterToNumber.put("G", 3);
		LetterToNumber.put("L", 3);
		LetterToNumber.put("S", 3);

		LetterToNumber.put("D", 4);
		LetterToNumber.put("M", 4);
		LetterToNumber.put("T", 4);

		LetterToNumber.put("E", 5);
		LetterToNumber.put("H", 5);
		LetterToNumber.put("N", 5);
		LetterToNumber.put("X", 5);

		LetterToNumber.put("U", 6);
		LetterToNumber.put("V", 6);
		LetterToNumber.put("W", 6);

		LetterToNumber.put("O", 7);
		LetterToNumber.put("Z", 7);

		LetterToNumber.put("F", 8);
		LetterToNumber.put("P", 8);
	}
}
