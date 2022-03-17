package com.lti.dto;

public class RegisterStatus {

	private boolean status;
	 private String messageIfAny;
	 private int registeredCustomerId;
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the messageIfAny
	 */
	public String getMessageIfAny() {
		return messageIfAny;
	}
	/**
	 * @param messageIfAny the messageIfAny to set
	 */
	public void setMessageIfAny(String messageIfAny) {
		this.messageIfAny = messageIfAny;
	}
	/**
	 * @return the registeredCustomerId
	 */
	public int getRegisteredCustomerId() {
		return registeredCustomerId;
	}
	/**
	 * @param registeredCustomerId the registeredCustomerId to set
	 */
	public void setRegisteredCustomerId(int registeredCustomerId) {
		this.registeredCustomerId = registeredCustomerId;
	}

	 
	 
	 
}
