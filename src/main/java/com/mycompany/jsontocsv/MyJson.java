/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsontocsv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/**
 *
 * @author BuNty
 */



public class MyJson{
        public static class Meta{
	  
    }
	  @JsonIgnore private Meta meta; 
	  private List<Results> results; 

	  public Meta getMeta(){
	  	return meta; 
	  }
	  public void setMeta(Meta input){
	  	 this.meta = input;
	  }
	  public List<Results> getResults(){
	  	return results; 
	  }
	  public void setResults(List<Results> input){
	  	 this.results = input;
	  }
}
  