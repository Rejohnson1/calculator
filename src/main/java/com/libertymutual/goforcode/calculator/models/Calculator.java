package com.libertymutual.goforcode.calculator.models;

public class Calculator {

	// declare the array name
	// create the array
	// initialize the array
	
	private double result;
	private double firstNumber;
	private String operator;
	private double secondNumber;
	
	public void addNum (double firstNumber, double secondNumber) {
		result =  firstNumber + secondNumber;
		this.firstNumber = firstNumber;
		this.operator = "+";
		this.secondNumber = secondNumber;
		}
	public void subNum (double firstNumber, double secondNumber) {
		result = firstNumber - secondNumber;
		this.firstNumber = firstNumber;
		this.operator = "-";
		this.secondNumber = secondNumber;
			
	}
	public void multNum (double firstNumber, double secondNumber) {
		result = firstNumber * secondNumber;
		this.firstNumber = firstNumber;
		this.operator = "*";
		this.secondNumber = secondNumber;
		
	}
	public void divNum (double firstNumber, double secondNumber)  {
		result = firstNumber / secondNumber;
		this.firstNumber = firstNumber;
		this.operator = "/";
		this.secondNumber = secondNumber;

	}
	public void expNum (double firstNumber, double secondNumber)	{
		result = Math.pow(firstNumber, secondNumber);			
		this.firstNumber = firstNumber;
		this.operator = "^";
		this.secondNumber = secondNumber;

	}
	
	public double getResult() {
		return result;
	}
	public double getFirstNumber() {
		return firstNumber;
	}
	public String getOperator() {
		return operator;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
}
