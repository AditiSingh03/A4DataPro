package parser.harvestIndustrail;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public  class HarvestLookupData {
	
	public static  Map<String,String> Dimension1Units =new HashMap<String, String>();
	public static  Map<String,String> Dimension1Type =new HashMap<String, String>();
	public static Map<String, String> COLOR_MAP =new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

	static{
		Dimension1Units.put("1","in");
		Dimension1Units.put("2","ft");
		Dimension1Units.put("3","yds");
		Dimension1Units.put("4","mm");
		Dimension1Units.put("5","cm");
		Dimension1Units.put("6","meter");
		Dimension1Units.put("7","mil");
	
		
		Dimension1Type.put("1", "Length");
		Dimension1Type.put("2", "Width");
		Dimension1Type.put("3", "Height");
		Dimension1Type.put("4", "Depth");
		Dimension1Type.put("5", "Dia");
		Dimension1Type.put("6", "Thickness");
		


		COLOR_MAP.put("BLACK","Medium Black"); //TotesFactory
		COLOR_MAP.put("RED","Medium Red");
		COLOR_MAP.put("TEAL","Medium Green");
		COLOR_MAP.put("LIME","Medium Green");
		COLOR_MAP.put("GRAY","Medium Gray");
		COLOR_MAP.put("ROYAL","Bright Blue");
		COLOR_MAP.put("NAVY","Dark Blue");
		COLOR_MAP.put("Orange","Medium Orange");
		COLOR_MAP.put("Royal Blue","Bright Blue");
		COLOR_MAP.put("Royal Red","Bright Red");
		COLOR_MAP.put("Kelly","Medium Green");
		COLOR_MAP.put("Yellow","Medium Yellow");
		COLOR_MAP.put("Kelly Green","Medium Green");
		COLOR_MAP.put("Natural","Medium White");
		COLOR_MAP.put("Hunter","Medium Green");
		COLOR_MAP.put("Gold","Gold Metal");
		COLOR_MAP.put("Silver","Silver Metal");
		COLOR_MAP.put("Rosegold","Medium Pink");
		COLOR_MAP.put("Gunmetal","Medium Gray");
		COLOR_MAP.put("Hunter Green","Medium Green");
		COLOR_MAP.put("Burgundy","Dark Red");
		COLOR_MAP.put("Natural W/ Royal","Medium White:Combo:Bright Red:Secondary");
		COLOR_MAP.put("Green","Medium Green");
		COLOR_MAP.put("Grey","Medium Gray");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("Pink","Medium Pink");
		COLOR_MAP.put("Purple","Medium Purple");
		COLOR_MAP.put("Ivory","Medium White");
		COLOR_MAP.put("Dark Green","Dark Green");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("Lime Green","Medium Green");
		COLOR_MAP.put("Beige","Medium White");
		COLOR_MAP.put("Tan","Medium Brown");
		COLOR_MAP.put("Khaki","Medium Brown");
		COLOR_MAP.put("Dark Gray","Dark Gray");
		COLOR_MAP.put("Carolina Blue","Medium Blue");
		COLOR_MAP.put("Blue","Medium Blue");
		COLOR_MAP.put("Chestnut","Medium Brown");
		COLOR_MAP.put("Camo/lack Trim","Camouflage Green:Combo:Medium Black:Trim");
		COLOR_MAP.put("Navy Stripe/White Trim","Dark Blue:Combo:Medium White:Trim");
		COLOR_MAP.put("White/Burgundy Trim","Medium White:Combo:Dark Red:Trim");
		COLOR_MAP.put("White/Navy Trim","Medium White:Combo:Dark Blue:Trim");
		COLOR_MAP.put("Chocolate","Medium Brown");
		COLOR_MAP.put("Light Pink","Light Pink");
		COLOR_MAP.put("Maroon","Dark Red");
		COLOR_MAP.put("Army","Medium Green");
		COLOR_MAP.put("Azalea","Medium Pink");
		COLOR_MAP.put("Forest","Medium Green");
		COLOR_MAP.put("Hot Pink","Medium Pink");
		COLOR_MAP.put("Lavender","Medium Purple");
		COLOR_MAP.put("Sapphire","Medium Blue");
		COLOR_MAP.put("Texas Orange","Medium Orange");
		COLOR_MAP.put("Turquoise","Light Blue");
		COLOR_MAP.put("Natrural","Medium White");
		COLOR_MAP.put("Light Blue","Light Blue");
		COLOR_MAP.put("Brown","Medium Brown");
		COLOR_MAP.put("Charcoal","Medium Black");
		COLOR_MAP.put("White & Yellow","Medium White:Combo:Medium Yellow:Secondary");
		COLOR_MAP.put("Sage Green/Off White","Dark Green:Combo:Light White:Secondary");
		COLOR_MAP.put("Natural/Off White","Medium White:Combo:Light White:Secondary");
		COLOR_MAP.put("Sage Green","Medium Green");
		COLOR_MAP.put("Chocolate Brown","Medium Brown");
		COLOR_MAP.put("Natural/Black","Medium White:Combo:Medium Black:Secondary");
		COLOR_MAP.put("Natural/Natural","Medium White");
		COLOR_MAP.put("Natural/Navy","Medium White:Combo:Dark Blue:Secondary");
		COLOR_MAP.put("Forest Gree","Dark Green");
		COLOR_MAP.put("Two Tone","Other");
		COLOR_MAP.put("all colors with Natural; Black","Other");
		COLOR_MAP.put("Natural body with Color Handles; Army","Other");
		COLOR_MAP.put("Indigo Denim","Dark Blue");
		COLOR_MAP.put("Turaqoise","Light Blue");

		
		COLOR_MAP.put("Light Brown","Light Brown");
		COLOR_MAP.put("Clear","Clear");
		COLOR_MAP.put("Gold","Gold Metal");
		COLOR_MAP.put("Silver","Silver Metal");
		COLOR_MAP.put("Platinum","Medium Gray");
		COLOR_MAP.put("Black","Medium Black");
		COLOR_MAP.put("Burgundy","Dark Red");
		COLOR_MAP.put("Snokeflake","Medium Blue");
		COLOR_MAP.put("Snowflake","Medium Blue");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("Assorted","Assorted");
		COLOR_MAP.put("Red","Medium Red");
		COLOR_MAP.put("Dark Red","Dark Red");
		COLOR_MAP.put("Dark Blue","Dark Blue");
		COLOR_MAP.put("Blue","Medium Blue");
		COLOR_MAP.put("Dark Blue","Dark Blue");
		COLOR_MAP.put("Dark Green","Dark Green");
		COLOR_MAP.put("Multi color","Multi Color");
		COLOR_MAP.put("Pink","Medium Pink");
		COLOR_MAP.put("Light Pink","Light Pink");
		COLOR_MAP.put("Orange","Medium Orange");
		COLOR_MAP.put("Yellow","Medium Yellow");
		COLOR_MAP.put("Lime Green","Bright Green");
		COLOR_MAP.put("Green","Medium Green");
		COLOR_MAP.put("Dark Green","Dark Green");
		COLOR_MAP.put("Navy","Dark Blue");
		COLOR_MAP.put("Purple","Medium Purple");
		COLOR_MAP.put("Brown","Medium Brown");
		COLOR_MAP.put("Light Brown","Light Brown");
		COLOR_MAP.put("Charcoal Black","Medium Black");
		COLOR_MAP.put("Light Pink","Light Pink");
		COLOR_MAP.put("Lime","Bright Green");
		COLOR_MAP.put("Light Blue","Light Blue");
		COLOR_MAP.put("Sage","Medium Green");
		COLOR_MAP.put("Platinum.","Medium Gray");
		COLOR_MAP.put("Hot Pink","Bright Pink");
		COLOR_MAP.put("Chocolate","Medium Brown");
		COLOR_MAP.put("Gray","Medium Gray");
		COLOR_MAP.put("Clear Frosted","Clear");
		COLOR_MAP.put("Clear/Frosted","Clear");
		COLOR_MAP.put("Royal Blue","Bright Blue");
		COLOR_MAP.put("Clear-Frosted","Clear");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("Translucent Purple","Clear Purple");
		COLOR_MAP.put("Translucent Blue","Clear Blue");
		COLOR_MAP.put("Translucent Red","Clear Red");
		COLOR_MAP.put("Translucent Green","Clear Green");
		COLOR_MAP.put("Kraft","Light Brown");
		COLOR_MAP.put("Ivory","Medium White");

		COLOR_MAP.put("Name","Color Group");
		COLOR_MAP.put("Gold","Dark Yellow");
		COLOR_MAP.put("Red","Medium Red");
		COLOR_MAP.put("Blue","Medium Blue");
		COLOR_MAP.put("Brown","Medium Brown");
		COLOR_MAP.put("Green","Medium Green");
		COLOR_MAP.put("Purple","Medium Purple");
		COLOR_MAP.put("Royal Blue","Bright Blue");
		COLOR_MAP.put("White","Medium White");
		COLOR_MAP.put("Orange","Medium Orange");
		COLOR_MAP.put("Yellow","Medium Yellow");
		COLOR_MAP.put("Cream Beige","Light Yellow");
		COLOR_MAP.put("Teal Green","Medium Green");
		COLOR_MAP.put("Navy Blue","Dark Blue");
		COLOR_MAP.put("Maroon Red","Dark Red");
		COLOR_MAP.put("Assorted","Assorted");
		COLOR_MAP.put("Red/White/Blue","Medium Red:Combo:Medium White:Secondary:Medium Blue");
		COLOR_MAP.put("Assorted Colors","Assorted");
		COLOR_MAP.put("Silver/Assorted","Silver Metal:Combo:Assorted");
		COLOR_MAP.put("All Colors","Assorted");
		COLOR_MAP.put("Stainless","Medium Gray");
		COLOR_MAP.put("Black","Medium Black");
		COLOR_MAP.put("Gray","Medium Gray");
		COLOR_MAP.put("Pink","Medium Pink");
		COLOR_MAP.put("Navy","Dark Blue");
		COLOR_MAP.put("Maroon","Dark Red");
		COLOR_MAP.put("Any Color","Assorted");
		COLOR_MAP.put("Silver/Black","Silver Metal:Combo:Medium Black");
		COLOR_MAP.put("Orange/Black","Silver Metal:Combo:Medium Black");
		COLOR_MAP.put("Black/Gold","Medium Black:Combo:Dark Yellow");
		COLOR_MAP.put("Maroon Red/Black","Dark Red:Combo:Medium Black");
		COLOR_MAP.put("Green/Black","Medium Green:Combo:Medium Black");
		COLOR_MAP.put("Purple/Black","Medium Purple:Combo:Medium Black");
		COLOR_MAP.put("Silver/Gold","Silver Metal:Combo:Dark Yellow");
		COLOR_MAP.put("Silver/Purple","Silver Metal:Combo:Medium Purple");
		COLOR_MAP.put("Silver/Teal Green","Silver Metal:Combo:Medium Teal");
		COLOR_MAP.put("Silver/Navy Blue","Silver Metal:Combo:Dark Blue");
		COLOR_MAP.put("Kelly Green","Bright Green");
		COLOR_MAP.put("Tan Brown/Black","Light Brown:Combo:Medium Black");
		COLOR_MAP.put("White/Assorted Accent","Medium White:Combo:Assorted");
		COLOR_MAP.put("Red/White","Medium Red:Combo:Medium White");
		COLOR_MAP.put("White/Red","Medium White:Combo:Medium Red");
		COLOR_MAP.put("Orange/Black/Green Accent","Medium Orange:Combo:Medium Black:Secondary:Medium Green");
		COLOR_MAP.put("Red/Black","Medium Red:Combo:Medium Black");
		COLOR_MAP.put("Blue/White","Medium Blue:Combo:Medium White");
		COLOR_MAP.put("Teal Blue/Aqua Blue","Medium Teal:Combo:Medium Blue");
		COLOR_MAP.put("Black/Gray/Yellow","Medium Black:Combo:Medium Gray:Secondary:Medium Yellow");
		COLOR_MAP.put("Orange/Pink/Blue/Black Trim","Multi Color");
		COLOR_MAP.put("Yellow Gold/Yellow Trim","Dark Yellow:Combo:Medium Yellow");
		COLOR_MAP.put("Blue/Black/Red","Medium Blue:Combo:Medium Black:Secondary:Medium Red");
		COLOR_MAP.put("Aqua Blue/Black","Medium Blue:Combo:Medium Black");
		COLOR_MAP.put("Aqua Blue","Medium Blue");
		COLOR_MAP.put("Silver/Orange/Black","Silver Metal:Combo:Medium Orange:Secondary:Medium Black");
		COLOR_MAP.put("Silver/Assorted Fill","Silver Metal:Combo:Assorted");
		COLOR_MAP.put("Gold/Assorted","Gold Metal:Combo:Assorted");
		COLOR_MAP.put("Silver","Silver Metal");
		COLOR_MAP.put("Brown/White Accent","Medium Brown:Combo:Medium White");
		COLOR_MAP.put("Black/White","Medium Black:Combo:Medium White");
		COLOR_MAP.put("White/Brown/Black","Medium White:Combo:Medium Brown:Secondary:Medium Black");
		COLOR_MAP.put("Black/Beige","Medium Black:Combo:Light Brown");
		COLOR_MAP.put("White/Pink","Medium White:Combo:Medium Pink");
		COLOR_MAP.put("Brown/White","Medium Brown:Combo:Medium White");
		COLOR_MAP.put("White/Brown","Medium White:Combo:Medium Brown");
		COLOR_MAP.put("Gray/Light Gray","Medium Gray:Combo:Light Gray");
		COLOR_MAP.put("Gray/White","Medium Gray:Combo:Medium White");
		COLOR_MAP.put("White/Black","Medium White:Combo:Medium Black");
		COLOR_MAP.put("White/Lavender Purple Trim","Medium White:Combo:Medium Purple");
		COLOR_MAP.put("White/Assorted","Medium White:Combo:Assorted");
		COLOR_MAP.put("White/Yellow","Medium White:Combo:Medium Yellow");
		COLOR_MAP.put("Light Brown/Beige","Light Brown:Combo:Light Brown");
		COLOR_MAP.put("Green/White","Medium Green:Combo:Medium White");
		COLOR_MAP.put("Beige","Light Brown");
		COLOR_MAP.put("White/Brown/Red Accent","Medium White:Combo:Medium Brown:Secondary:Medium Red");
		COLOR_MAP.put("Beige/Red/White","Light Brown:Combo:Medium Red:Secondary:Medium White");
		COLOR_MAP.put("Clear","Clear");
		COLOR_MAP.put("Blue Agean","Medium Blue");
		COLOR_MAP.put("Blue/Black","Medium Blue:Combo:Medium Black");
		COLOR_MAP.put("Champagne Beige","Light Brown");
		COLOR_MAP.put("Metallic Blue","Metallic Blue");
		COLOR_MAP.put("Metallic Red","Metallic Red");
		COLOR_MAP.put("Camouflage Beige","Camouflage Brown");
		COLOR_MAP.put("Camouflage Green","Camouflage Green");
		COLOR_MAP.put("Gray/Black Strap","Medium Gray:Combo:Medium Black");
		COLOR_MAP.put("Blue/Gray","Medium Blue:Combo:Medium Gray");
		COLOR_MAP.put("Navy Blue/Light Blue","Dark Blue:Combo:Light Blue");
		COLOR_MAP.put("Pink/Black","Medium Pink:Combo:Medium Black");
		COLOR_MAP.put("Black/Gray","Medium Black:Combo:Medium Gray");
		COLOR_MAP.put("Blue/Black Trim","Medium Blue:Combo:Medium Black");
		COLOR_MAP.put("Green/Black Trim","Medium Green:Combo:Medium Black");
		COLOR_MAP.put("Green/Black Cord","Medium Green:Combo:Medium Black");
		COLOR_MAP.put("Blue/Black Straps","Medium Blue:Combo:Medium Black");
		COLOR_MAP.put("Brown/Green/Yellow/White","Multi Color");
		COLOR_MAP.put("Multi color","Multi Color");
		COLOR_MAP.put("Coffee Brown","Medium Brown");
		COLOR_MAP.put("Khaki Beige","Light Brown");
		COLOR_MAP.put("Olive Green","Dark Green");
		COLOR_MAP.put("Mustard","Medium Yellow");
		COLOR_MAP.put("Natural Beige","Light Brown");
		COLOR_MAP.put("Fuchsia Pink","Bright Pink");
		COLOR_MAP.put("Lime Green","Light Green");
		COLOR_MAP.put("Turquoise Blue","Light Blue");
		COLOR_MAP.put("Forest Green","Dark Green");
		COLOR_MAP.put("Yellow/Black","Medium Yellow:Combo:Medium Black");
		COLOR_MAP.put("Assorted Stripe","Assorted");
		COLOR_MAP.put("Charcoal","Dark Gray");
		COLOR_MAP.put("White Pink","Medium White:Combo:Medium Pink");
		COLOR_MAP.put("Red/Orange/Yellow/Green/Assorted","Multi Color");
		COLOR_MAP.put("Light Blue","Light Blue");
		COLOR_MAP.put("Teal","Medium Green");
		COLOR_MAP.put("Burgundy","Dark Red");
		COLOR_MAP.put("Other","Other");
		COLOR_MAP.put("Any","Assorted");
		COLOR_MAP.put("White Red","Medium White:Combo:Medium Red");
		COLOR_MAP.put("Pink Blue","Medium Pink:Combo:Medium Blue");
		COLOR_MAP.put("Wine red","Dark Red");
		COLOR_MAP.put("White/ Black","Medium White:Combo:Medium Black");
		COLOR_MAP.put("White /Blue","Medium White:Combo:Medium Blue");
		COLOR_MAP.put("White/Green","Medium White:Combo:Medium Green");
		COLOR_MAP.put("promotions","Other");
		COLOR_MAP.put("trade shows","Other");
		COLOR_MAP.put("Retractable Earbuds","Other");
		COLOR_MAP.put("Green/ Black","Medium Green:Combo:Medium Black");
		COLOR_MAP.put("Transparent blue Transparent red","Clear Blue:Combo:Clear Red");
		COLOR_MAP.put("Silver body with smoky lid","Silver Metal:Combo:Dark Gray");
		COLOR_MAP.put("Pearlized white","Medium White");
		COLOR_MAP.put("Transparent Blue","Clear Blue");
		COLOR_MAP.put("Transparent Black","Clear Black");
		COLOR_MAP.put("Transparent Red","Clear Red");
		COLOR_MAP.put("Custom","Other");

		
	}
	
	public static String getDimensionUnits(int dimUnitid){
		return Dimension1Units.get(dimUnitid);
	}
	
	public static String getDimensionType(int dimTypeid){
		return Dimension1Type.get(dimTypeid);
	}

	public static Map<String, String> getCOLOR_MAP() {
		return COLOR_MAP;
	}

	
	

}

