package com.stringcalculator.test;

import static org.junit.jupiter.api.Assertions.*;

import com.stringcalculator.StringCalculator;
import com.stringcalculator.exception.NegativeNumberException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StringCalculatorTest {
	StringCalculator StringCalc;

	@BeforeEach
	void setUp() throws Exception {
		StringCalc = new StringCalculator();
	}

	@Test
	void testEmpty() {
		assertEquals(0, StringCalc.add(""));
	}
	@Test
	void testSingleArg() {
		assertEquals(1, StringCalc.add("1"));
	}
	@Test
	void testTwoArgsWithComma() {
		assertEquals(3, StringCalc.add("1,2"));
	}
	@Test
	void testNArgsWithComma() {
		assertEquals(10, StringCalc.add("1,2,3,4"));
	}
	@Test
	void testNArgsWithSemiColon() {
		assertEquals(18, StringCalc.add("4;5;4;5"));
	}
	@Test
	void testNArgsWithCommaAndSemiColon() {
		assertEquals(19, StringCalc.add("4,8;3,4"));
	}
	@Test
	void testNArgsWithNewLine() {
		assertEquals(19, StringCalc.add("4,\n8;\n3,4"));
	}
	@Test
	void testNArgsWithNewLineNoComma() {
		assertEquals(19, StringCalc.add("4\n8\n3,4"));
	}
	@Test
	void testNArgsWithNewDelimiters() {
		assertEquals(19, StringCalc.add("//;4\n8\n3,4"));
	}
	
	@Test
	public void testNegativeArgs() {
	    try {
	    	StringCalc.add("1,-2,3,-4,-9");
	    	fail("Expected exception was not thrown");
	    } catch (NegativeNumberException e) {
	        assertEquals("negative numbers not allowed -2,-4,-9", e.getMessage());
	    }
	}
	
	@Test
	void testBiggerThanThousand() {
		assertEquals(1002, StringCalc.add("2,1001,1000"));
	}
	

}
