package com.a4tech.product.newproducts.criteria.parser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.a4tech.product.model.ImprintMethod;
import com.a4tech.util.ApplicationConstants;

public class NewProProductImprintmethodParser {
private Logger              _LOGGER              = Logger.getLogger(getClass());
	
	public List<ImprintMethod> getImprintCriteria(String imprintValue,List<ImprintMethod> impmthdList){
		
		Set<ImprintMethod> setOfImprintMethod =  new HashSet<ImprintMethod>();
		ImprintMethod imprintObj=null;
		try{
				String imprintArr[] = imprintValue.split(ApplicationConstants.CONST_STRING_COMMA_SEP);
				for (String imprintMethod : imprintArr) {
					imprintObj=new ImprintMethod();
		 			imprintObj.setType(imprintMethod.trim());
		 			imprintObj.setAlias(imprintMethod.trim());
		 			setOfImprintMethod.add(imprintObj);
				}
			
	
		}catch(Exception e){
			_LOGGER.error("Error while processing Imprint Method :"+e.getMessage());             
		   	return null;
		   	
		   }
		impmthdList.addAll(setOfImprintMethod);
		return impmthdList;
		
	}
}
