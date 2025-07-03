package com.stringcalculator;

import static org.junit.jupiter.api.Assertions.*;

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

}
