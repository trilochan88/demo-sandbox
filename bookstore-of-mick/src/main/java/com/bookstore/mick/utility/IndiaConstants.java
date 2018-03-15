package com.bookstore.mick.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndiaConstants {
	public final static String IND = "INDIA";

	public final static Map<String, String> mapOfIndianStates = new HashMap<String, String>() {
		{
			put("JK", "Jammu and Kashmir");
			put("PB", "Punjab");
			put("HP", "Himachal Pardesh");
			put("DEL", "DELHI");
			put("CHG", "Chandigarh");
			put("UK", "Uttarakhand");
			put("UP", "Uttar Pardesh");
			put("RJ", "Rajasthan");
			put("MP", "Madhya Pardesh");
			put("GUJ", "Gujrat");
			put("GA", "Goa");
			put("MH", "Maharashtra");
			put("CH", "Chatishgarh");
			put("BH", "Bihar");
			put("JH", "Jharkhand");
			put("OR", "Orissa");
			put("WB", "West Bengal");
			put("KA", "Karnataka");
			put("KL", "Kerala");
			put("TN", "Tamil Naidu");
			put("AP", "Andhra Pardesh");
			put("AM", "Assam");
			put("Aru", "Arunachal Pardesh");
			put("MG", "Meghalaya");
			put("NL", "Nagaland");
			put("MZ", "Mizoram");
			put("TP", "Tripura");
			put("SK", "Sikkim");
			put("MN", "Manipur");
			put("HR", "Haryana");
			put("TL", "Telangana");
		}

	};
	public final static List<String> listOfIndiaStatesCode = new ArrayList<>(mapOfIndianStates.keySet());
	public final static List<String> listOfIndiaStatesName = new ArrayList<>(mapOfIndianStates.values());
}
