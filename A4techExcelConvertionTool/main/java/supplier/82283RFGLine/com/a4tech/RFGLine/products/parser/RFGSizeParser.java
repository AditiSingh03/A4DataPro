package com.a4tech.RFGLine.products.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.a4tech.product.model.Dimension;
import com.a4tech.product.model.Size;
import com.a4tech.product.model.Value;
import com.a4tech.product.model.Values;
import com.a4tech.util.ApplicationConstants;


public class RFGSizeParser {
 
	
	public Size getSizes(String descriptionSize)
	{
  Size sizeObj=new Size();
  Dimension dimensionObj= new Dimension();

  String descrSizeArr[]=descriptionSize.split("x");

	List<Values> valuesList = new ArrayList<Values>();
	List<Value> valuelist =  new ArrayList<Value>();
	Values valuesObj = new Values();
	Value valObj=null;
	if(descrSizeArr.length==3)
	{
	if(!StringUtils.isEmpty(descrSizeArr[0]))
	{
		 valObj=new Value();
		valObj.setAttribute("Width");
		descrSizeArr[0]=descrSizeArr[0].replace("W",ApplicationConstants.CONST_STRING_EMPTY);
		valObj.setValue(descrSizeArr[0].trim());
		valObj.setUnit(ApplicationConstants.CONST_STRING_INCHES);
		valuelist.add(valObj);
	}
	 if(!StringUtils.isEmpty(descrSizeArr[1]))
	{
	   valObj=new Value();
		valObj.setAttribute("Height");
		descrSizeArr[1]=descrSizeArr[1].replace("H",ApplicationConstants.CONST_STRING_EMPTY);
		valObj.setValue(descrSizeArr[1].trim());
		valObj.setUnit(ApplicationConstants.CONST_STRING_INCHES);
		valuelist.add(valObj);
	}
	 if(!StringUtils.isEmpty(descrSizeArr[2]))
	{
		valObj=new Value();
		valObj.setAttribute("Depth");
		descrSizeArr[2]=descrSizeArr[2].replace("D",ApplicationConstants.CONST_STRING_EMPTY);
		descrSizeArr[2]=descrSizeArr[2].replace("Gusset",ApplicationConstants.CONST_STRING_EMPTY);
		descrSizeArr[2]=descrSizeArr[2].replace("G",ApplicationConstants.CONST_STRING_EMPTY);
		valObj.setValue(descrSizeArr[2].trim());
		valObj.setUnit(ApplicationConstants.CONST_STRING_INCHES);
		valuelist.add(valObj);

	}
	}
	
	else if(descrSizeArr.length==2){
		if(!StringUtils.isEmpty(descrSizeArr[0]))
		{
			 valObj=new Value();
			valObj.setAttribute("Width");
			descrSizeArr[0]=descrSizeArr[0].replace("W",ApplicationConstants.CONST_STRING_EMPTY);
			valObj.setValue(descrSizeArr[0].trim());
			valObj.setUnit(ApplicationConstants.CONST_STRING_INCHES);
			valuelist.add(valObj);
		}
		 if(!StringUtils.isEmpty(descrSizeArr[1]))
		{
		   valObj=new Value();
			valObj.setAttribute("Height");
			descrSizeArr[1]=descrSizeArr[1].replace("H",ApplicationConstants.CONST_STRING_EMPTY);
			valObj.setValue(descrSizeArr[1].trim());
			valObj.setUnit(ApplicationConstants.CONST_STRING_INCHES);
			valuelist.add(valObj);
		}
	}	
	

	valuesObj.setValue(valuelist);
	valuesList.add(valuesObj);
	dimensionObj.setValues(valuesList);
	sizeObj.setDimension(dimensionObj);

		
		return sizeObj;
	}
}

