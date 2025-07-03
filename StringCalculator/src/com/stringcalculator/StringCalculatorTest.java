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

}
