package com.stringcalculator;

public class StringCalculator {
	public int add(String s) {
		
		if(s.isEmpty()) {
			return 0;
		}
		
		if(s.length() == 1) {
			int arg1 = Integer.parseInt(s);
			return arg1;
		}
		
		String args[] = s.split(",");
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		return sum;
	}
}
