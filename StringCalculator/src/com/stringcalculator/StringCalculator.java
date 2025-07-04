package com.stringcalculator;

import com.stringcalculator.exception.NegativeNumberException;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	private int calculateSum(String Args[]) {
		int sum = 0;
		List<Integer> negativeNumbers = new ArrayList<>();

		//Iterating through arguments
		for(String arg : Args) {
			if (arg.equals("//")) {
                continue;
            }
			
			int Value = Integer.parseInt(arg);
			//Check for negative numbers 
			if(Value < 0) {
				negativeNumbers.add(Value);
				continue;
			}
			
			//Numbers bigger than 1000 should be ignored
			if(Value > 1000) {
				continue;
			}
			
			sum += Value;
		}
		
		//if negative numbers exist throw ERROR
		if(!negativeNumbers.isEmpty()) {
			StringBuilder sb = new StringBuilder();
            for (int n : negativeNumbers) {
                sb.append(n);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
			throw new NegativeNumberException("negative numbers not allowed "+sb.toString());
		}
		
		return sum;
	}
	
	public int add(String s) {

		//Base Case Empty String
		if(s.isEmpty() || s==null) {
			return 0;
		}
		
		//For Strings With single Argument
		if(s.length() == 1) {
			int arg1 = Integer.parseInt(s); //Add Error Handling (Non Digit Input)
			return arg1;
		}
		
		//String with split using , or ; With \n
		String Args[] = s.split("[,;\\n]+");
		return calculateSum(Args);
	}
}
