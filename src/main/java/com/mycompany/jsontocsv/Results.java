/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsontocsv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 *
 * @author BuNty
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Results{
        public static class Receiver{

        }
        public static class Primarysource{
	
        }
        public static class Sender{
	
        }
        public static class Patient{
	
        }
           private String seriousnesshospitalization;
	  private String receivedate; 
	  private String receiptdate; 
	  @JsonIgnore private Patient patient; 
	  @JsonIgnore private Sender sender; 
	  private String transmissiondate; 
	 @JsonIgnore private Primarysource primarysource; 
	  private String seriousnessother; 
	  private String transmissiondateformat; 
	  private String receiptdateformat; 
	  private String receiver; 
	  private String serious; 
	  private String receivedateformat; 
	  private String fulfillexpeditecriteria; 
	  private String safetyreportid; 
	  private String companynumb; 

	  public String getReceivedate(){
	  	return receivedate; 
	  }  
          public String getSeriousnesshospitalization(){
	  	return seriousnesshospitalization; 
	  }
          public void setSeriousnesshospitalization(String input){
	  	 this.seriousnesshospitalization = input;
	  } 
	  public void setReceivedate(String input){
	  	 this.receivedate = input;
	  }
	  public String getReceiptdate(){
	  	return receiptdate; 
	  }
	  public void setReceiptdate(String input){
	  	 this.receiptdate = input;
	  }
	  public Patient getPatient(){
	  	return patient; 
	  }
	  public void setPatient(Patient input){
	  	 this.patient = input;
	  }
	  public Sender getSender(){
	  	return sender; 
	  }
	  public void setSender(Sender input){
	  	 this.sender = input;
	  }
	  public String getTransmissiondate(){
	  	return transmissiondate; 
	  }
	  public void setTransmissiondate(String input){
	  	 this.transmissiondate = input;
	  }
	  public Primarysource getPrimarysource(){
	  	return primarysource; 
	  }
	  public void setPrimarysource(Primarysource input){
	  	 this.primarysource = input;
	  }
	  public String getSeriousnessother(){
	  	return seriousnessother; 
	  }
	  public void setSeriousnessother(String input){
	  	 this.seriousnessother = input;
	  }
	  public String getTransmissiondateformat(){
	  	return transmissiondateformat; 
	  }
	  public void setTransmissiondateformat(String input){
	  	 this.transmissiondateformat = input;
	  }
	  public String getReceiptdateformat(){
	  	return receiptdateformat; 
	  }
	  public void setReceiptdateformat(String input){
	  	 this.receiptdateformat = input;
	  }
	  public String getReceiver(){
	  	return receiver; 
	  }
	  public void setReceiver(String input){
	  	 this.receiver = input;
	  }
	  public String getSerious(){
	  	return serious; 
	  }
	  public void setSerious(String input){
	  	 this.serious = input;
	  }
	  public String getReceivedateformat(){
	  	return receivedateformat; 
	  }
	  public void setReceivedateformat(String input){
	  	 this.receivedateformat = input;
	  }
	  public String getFulfillexpeditecriteria(){
	  	return fulfillexpeditecriteria; 
	  }
	  public void setFulfillexpeditecriteria(String input){
	  	 this.fulfillexpeditecriteria = input;
	  }
	  public String getSafetyreportid(){
	  	return safetyreportid; 
	  }
	  public void setSafetyreportid(String input){
	  	 this.safetyreportid = input;
	  }
	  public String getCompanynumb(){
	  	return companynumb; 
	  }
	  public void setCompanynumb(String input){
	  	 this.companynumb = input;
	  }
}
