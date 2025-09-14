package com.testcases.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.trials.example.Calculator;

class CalculatorTest {
	
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all test cases");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("called Before each test cases");
		//object-fresh copy for each test
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called After each test cases");
		calculator = null;
	}

	@Test
	@Disabled
	@DisplayName("Testing sum method")
	void testSum() {
		int actual =calculator.sum(10, 20);
		assertEquals(30, actual);
	}
	
	@Test
	@DisplayName("Testing product method")
	void testProduct() {
		int actual =calculator.product(2, 2);
		assertEquals(4, actual);
		actual =calculator.product(2, 3);
		assertEquals(6, actual);
	}

}
