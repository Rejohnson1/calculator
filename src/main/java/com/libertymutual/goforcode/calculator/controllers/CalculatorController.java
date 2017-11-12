package com.libertymutual.goforcode.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.calculator.models.Calculator;
import com.libertymutual.goforcode.calculator.models.Storage;

@Controller
public class CalculatorController {
	private Storage storage;
		
		public CalculatorController() {
		storage = new Storage();
		}

	@RequestMapping("/")
	public String defaultPage() {
		return "calculator";
	}

	@RequestMapping("/calculator")
	//when the user hits the calculate button on the page, create a View of the data showing the first number, the second number, 
	//the operator and the result. The Calculator java is doing the calculations methods
		public ModelAndView showCalc(double firstNumber, String operator, double secondNumber) {
		if (operator.equals("+")) {
			Calculator calculator = new Calculator(); 
			calculator.addNum(firstNumber, secondNumber);
			storage.storeCalcs(calculator);
		}
		if (operator.equals("-")) {
			Calculator calculator = new Calculator(); 
			calculator.subNum(firstNumber, secondNumber);
			storage.storeCalcs(calculator);
		}
		if (operator.equals("*")) {
			Calculator calculator = new Calculator(); 
			calculator.multNum(firstNumber, secondNumber);
			storage.storeCalcs(calculator);
		}
		if (operator.equals("/")) {
			Calculator calculator = new Calculator(); 
			calculator.divNum(firstNumber, secondNumber);
			storage.storeCalcs(calculator);
		}
		if (operator.equals("^")) {
			Calculator calculator = new Calculator(); 
			calculator.expNum(firstNumber, secondNumber);
			storage.storeCalcs(calculator);
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		mv.addObject("store", storage); //passing back all of the data from the calculator method back to the controller for reuse
		//mv.addObject("firstNumber", firstNumber); //
		//mv.addObject("operator", operator);
		//mv.addObject("secondNumber", secondNumber);
		return mv;
	}
}