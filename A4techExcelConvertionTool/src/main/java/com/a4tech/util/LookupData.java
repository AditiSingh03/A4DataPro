package com.a4tech.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LookupData {
	
	public static final Map<String,String> criteriaCodeMap =new HashMap<String, String>();
	public static final Set<String> repeateIndex = new HashSet<String>();
	public static final Set<String> shapes = new HashSet<String>();
	static{
		
		repeateIndex.add("1");
		repeateIndex.add("22");
		repeateIndex.add("23");
		repeateIndex.add("24");
		repeateIndex.add("25");
		repeateIndex.add("26");
		repeateIndex.add("27");
		repeateIndex.add("57");
		repeateIndex.add("58");
		repeateIndex.add("59");
		repeateIndex.add("61");
		repeateIndex.add("62");
		repeateIndex.add("63");
		repeateIndex.add("64");
		repeateIndex.add("65");
		repeateIndex.add("66");
		repeateIndex.add("67");
		repeateIndex.add("68");
		repeateIndex.add("69");
		repeateIndex.add("70");
		repeateIndex.add("71");
		repeateIndex.add("72");
		
		repeateIndex.add("73");
		repeateIndex.add("74");
		repeateIndex.add("75");
		repeateIndex.add("76");
		repeateIndex.add("77");
		repeateIndex.add("78");
		repeateIndex.add("79");
		repeateIndex.add("80");
		repeateIndex.add("81");
		repeateIndex.add("82");
		repeateIndex.add("83");
		repeateIndex.add("84");
		repeateIndex.add("85");
		repeateIndex.add("86");
		repeateIndex.add("87");
		repeateIndex.add("88");
		repeateIndex.add("89");
		repeateIndex.add("90");
		repeateIndex.add("91");
		
		repeateIndex.add("92");
		repeateIndex.add("97");
		repeateIndex.add("98");
		repeateIndex.add("99");
		repeateIndex.add("100");
		repeateIndex.add("101");
		repeateIndex.add("102");
		repeateIndex.add("103");
		repeateIndex.add("104");
		repeateIndex.add("105");
		repeateIndex.add("106");
		repeateIndex.add("107");
		repeateIndex.add("108");
		repeateIndex.add("109");
		repeateIndex.add("110");
		repeateIndex.add("111");
		repeateIndex.add("112");
		repeateIndex.add("113");
		repeateIndex.add("114");
		repeateIndex.add("115");
		repeateIndex.add("116");
		repeateIndex.add("117");
		repeateIndex.add("118");
		repeateIndex.add("119");
		repeateIndex.add("120");
		repeateIndex.add("121");
		repeateIndex.add("122");
		repeateIndex.add("123");
		repeateIndex.add("124");
		repeateIndex.add("125");
		repeateIndex.add("126");
		repeateIndex.add("127");
		repeateIndex.add("128");
		repeateIndex.add("129");
		repeateIndex.add("130");
		repeateIndex.add("131");
		repeateIndex.add("132");
		repeateIndex.add("133");
		// product number
		repeateIndex.add("136");
		repeateIndex.add("137");
		repeateIndex.add("138");
		// sku index
		repeateIndex.add("140");
		repeateIndex.add("141");
		repeateIndex.add("144");
		repeateIndex.add("145");
		repeateIndex.add("146");
		repeateIndex.add("147");
		
		criteriaCodeMap.put("SABR", "Size-Apparel-Bra Sizes");
		criteriaCodeMap.put("SANS", "Apparel-Neck/Sleeve");
		criteriaCodeMap.put("SAHU","Apparel-Hosiery/Uniform (A,AB)" );
		criteriaCodeMap.put("SAIT","Apparel-Infant/Toddler (3 Months, 2T)" );
		criteriaCodeMap.put("SAWI",	"Apparel-Waist/Inseam" );
		criteriaCodeMap.put("CAPS","SIZE - Capacity" );
		criteriaCodeMap.put("DIMS","SIZE - Dimension" );
		criteriaCodeMap.put("SSNM","Standard & Numbered" );
		criteriaCodeMap.put("SVWT","Size-Volume/Weight" );
		criteriaCodeMap.put("SOTH","Size-Other" );
		criteriaCodeMap.put("SHWT","Shipping Weight" );
		criteriaCodeMap.put("SMPL","Samples" );
		criteriaCodeMap.put("TDNM","Trade Name");
		criteriaCodeMap.put("THEM","Theme" );
		criteriaCodeMap.put("SDRU","Same Day Service" );
		criteriaCodeMap.put("SHAP","Shape" );
		criteriaCodeMap.put( "PRTM","Production Time" );
		criteriaCodeMap.put("IMSZ","Imprint Size" );
		criteriaCodeMap.put("LMIN","Less than Minimum" );
		criteriaCodeMap.put("MTRL","Material" );
		criteriaCodeMap.put("PCKG","Packaging" );
		criteriaCodeMap.put("ADCL", "Additional Colors" );
		criteriaCodeMap.put("ADLN","Additional Location" );
		criteriaCodeMap.put("ARTW","Artwork & Proofs" );
		criteriaCodeMap.put("BTRY","Battery Information" );
		criteriaCodeMap.put("CARR","Carrier" );
		criteriaCodeMap.put("PRCL","Product Color" );
		criteriaCodeMap.put("ORGN","Origin" );
		criteriaCodeMap.put("FOBP", "FOB Point" );
		criteriaCodeMap.put("IMCL","Imprint Color" );
		criteriaCodeMap.put("IMLO","Imprint Location" );
		criteriaCodeMap.put("IMMD","Imprint Method" );
		criteriaCodeMap.put("IMOP","Imprint Option");
		criteriaCodeMap.put("ITWT","Item Weight");
		criteriaCodeMap.put("PERS","Personalization");
		criteriaCodeMap.put("PROP","Product Option");
		criteriaCodeMap.put( "RUSH","Rush Service ");
		criteriaCodeMap.put("SDIM","Shipping Dimension");
		criteriaCodeMap.put("SHES","Shipping Estimate");
		criteriaCodeMap.put("SHOP","Shipping Option");
		criteriaCodeMap.put("WARR","Warranty Information");
		
		shapes.add("CUSTOM");
		shapes.add("Circle");
		shapes.add("Octagon");
		shapes.add("Oval");
		
	}
	
	public static boolean isRepeateIndex(String indexNo){
		if(repeateIndex.contains(indexNo)){
			return true;
		}
		return false;
	}
	
	public static String getCriteriaValue(String criteriaCode){
		if(criteriaCode != null){
			return criteriaCodeMap.get(criteriaCode);
		}
		return "";
	}
	
	public static boolean isShape(String value){
		if(shapes.contains(value)){
			return true;
		}
		return false;
	}
	//public static String
}
