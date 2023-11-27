package org.java.test;

public class Calculator {
	
	public float add(float a, float b) {
		return a + b;
	}
	
	public float subtract(float a, float b) {
		return a - b;
	}

	public float divide(float a, float b) throws Exception{
		if(a == 0 || b == 0) {
			throw new Exception("Y cant be 0");
		}
		return a / b;
	}
	
	public float moltilpy(float a, float b) {
		return a * b;
	}
	
}