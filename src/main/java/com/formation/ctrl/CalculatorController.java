package com.formation.ctrl;

import com.formation.service.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {
	
	@Autowired
	private Calculator calculator;
	
	String sum(@RequestParam("a")Integer a, @RequestParam("b") Integer b ) {
		
		return String.valueOf(calculator.sum(a,b));
	}

}
