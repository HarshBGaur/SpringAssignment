package com.spring.assignment.demo;


import com.fasterxml.jackson.annotation.JsonProperty;



public class CardCheckService {

	@JsonProperty("creditcardNumber")
	private String creditcardNumber;
	
	public String getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(String creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	@JsonProperty("status")
	private String status = "false" ;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
