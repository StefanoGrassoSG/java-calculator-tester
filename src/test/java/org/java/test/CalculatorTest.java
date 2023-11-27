package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	
	public static Calculator c = null;
	Random random = new Random();

    float randomFloat = random.nextFloat();
  
	@BeforeAll
	public static void init() {
		c = new Calculator();
	}
	
	@RepeatedTest(2)
	public void addTest() {
		float x = randomFloat;
		float y = randomFloat;
		
		float sum = (float) x + y;
		assertEquals(sum, c.add(x, y), "SUM EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void subtractTest() {
		float x = randomFloat;
		float y = randomFloat;
		
		float sum = (float) x - y;
		assertEquals(sum, c.subtract(x, y), "SUBTRACION EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void moltiplyTest() {
		float x = randomFloat;
		float y = randomFloat;
		
		float sum = (float) x * y;
		assertEquals(sum, c.moltilpy(x, y), "MOLT EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void divideTest() throws Exception {
		float x = randomFloat;
		float y = randomFloat;
		
		float sum = (float) x / y;
		assertEquals(sum, c.divide(x, y), "DIV EXPECTED CORRECTLY");
	}
	
	@RepeatedTest(2)
	public void divideByZeroTest() {
		float x = randomFloat;
		float y = (float) 0;
		
		assertThrows(Exception.class,
				() -> c.divide(x,y), 
				"Exception for divide by 0");
	}

}