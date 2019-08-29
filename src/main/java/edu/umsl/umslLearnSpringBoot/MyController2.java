/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.umslLearnSpringBoot;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	//inject the message via applicaiton.properties
	@Value("${aboutus.message:test}")
	private String message = "";
	@RequestMapping("/about")
	
	public String aboutus(Map<String, Object> model){
		
		model.put("message", this.message);
		return "aboutus";
	}
	

}
