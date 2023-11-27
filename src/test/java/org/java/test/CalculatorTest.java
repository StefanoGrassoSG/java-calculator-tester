package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	
	public static Calculator c = null;
	Random random = new Random();
  
	@BeforeAll
	public static void init() {
		c = new Calculator();
	}
	
	@RepeatedTest(2)
	public void addTest() {
		float a = random.nextFloat() * 1000;
		float b = random.nextFloat() * 1000;
		
		float add = a + b;
		assertEquals(add, c.add(a, b), "result incorrect");
	}
	
	@RepeatedTest(2)
	public void subtractTest() {
		float a = random.nextFloat() * 1000;
		float b = random.nextFloat() * 1000;
		
		float sub = a - b;
		assertEquals(sub, c.subtract(a, b), "result incorrect");
	}
	
	@RepeatedTest(2)
	public void moltiplyTest() {
		float a = random.nextFloat() * 1000;
		float b = random.nextFloat() * 1000;
		
		float mol = a * b;
		assertEquals(mol, c.moltilpy(a, b), "result incorrect");
	}
	
	@RepeatedTest(2)
	public void divideTest() throws Exception {
		float a = random.nextFloat() * 1000;
		float b = random.nextFloat() * 1000;
		
		float div = a / b;
		assertEquals(div, c.divide(a, b), "result incorrect");
	}
	
	@RepeatedTest(2)
	public void divideByZeroTest() {
		float a = random.nextFloat() * 1000;
		float b = 0;
		
		assertThrows(Exception.class,
				() -> c.divide(a,b), 
				"exception not throwed");
	}

}