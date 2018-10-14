/**
 * 
 */
package com.temp.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Admin
 *
 */
public class DemoController {
	
	
	@GetMapping(value="/getDetails")
	public String getDetails(String name){
		
		return name;
		
		
		
	}

}
