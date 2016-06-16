package com.a4tech.product.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ImprintColorValue {

	@JsonProperty("Name")
	private String name;
	@JsonProperty("CustomerOrderCode")
	private String customerOrderCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerOrderCode() {
		return customerOrderCode;
	}

	public void setCustomerOrderCode(String customerOrderCode) {
		this.customerOrderCode = customerOrderCode;
	}
	
	public String toString() {
		return "{\"Name\": \"" + this.getName() + "\", \"CustomerOrderCode\": \"" + this.getCustomerOrderCode() + "\"},";
	}
	
	 public int hashCode(){
	        int hashcode = 0;
	        hashcode = name.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        if (obj instanceof ImprintColorValue) {
	        	ImprintColorValue imprintColor = (ImprintColorValue) obj;
	        	return (imprintColor.getName().equalsIgnoreCase(this.name));
	        } else {
	            return false;
	        }
	    }

}
