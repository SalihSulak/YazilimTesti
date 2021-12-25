package com.hipet.HesapMakinesi.service;

import java.util.ArrayList;
import java.util.List;

public class CalculatorService {
	public double sum(ArrayList<Double> numbers) {
		double sum=0;
		 for(double number:numbers)  {
			 sum += number;  
			}  
		return sum;
	}
	

	
}
