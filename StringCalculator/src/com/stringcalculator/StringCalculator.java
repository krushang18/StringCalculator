package com.stringcalculator;

public class StringCalculator {
	public int add(String s) {
		//Base Case Empty String
		if(s.isEmpty()) {
			return 0;
		}
		
		//For Strings With single Argument
		if(s.length() == 1) {
			int arg1 = Integer.parseInt(s); //Add Error Handling (Non Digit Input)
			return arg1;
		}
		
		//String with split using , or ; With \n
		String args[] = s.split("[,;\\n]+");
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		return sum;
	}
}
