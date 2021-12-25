package com.hipet.HesapMakinesi.service;

public class CalculatorService {
	public double sum(double number1, double number2) {
		
			double result = number1+number2;
		return result;
	}
	
	public double extraction(double number1, double number2) {
		
			double result = number1-number2;
		return result;
	}
	
	public double multiplication(double number1, double number2) {
		
			double result=1;
			result = number1*number2;
		return result;
	}
	
	public double division(double number1, double number2) {
		
			double result = number1/number2;
		return result;
	}
	
	public double log(double number1) {
		
			double result = Math.log10(number1);
		return result;
	}
	
	public double square(double number1) {
		
			double result = number1*number1;
		return result;
	}
	
	public double cub(double number1) {
		
			double result = number1*number1*number1;
		return result;
	}
	
	public double squareRoot(double number1) {
		
		double result = Math.sqrt(number1);
	return result;
}
}
