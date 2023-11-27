package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {
	
	public static Ticket c = null;
	final static double PRICE_FOR_KM = 0.21;
	final static  double OVER_DISCOUNT = 0.6;
	final static  double UNDER_DISCOUNT = 0.8;
	
	@Test
	public void ageTest() {
		int age = 0;
		double km = 1;
		
		assertThrows(Exception.class,
				() -> c = new Ticket(km,age), 
				"Age must be above 0");
	}
	
	@Test
	public void kmTest() {
		int age = 1;
		double km = 0;
		
		assertThrows(Exception.class,
				() -> c = new Ticket(km,age), 
				"KM must be above 0");
	}
	
	@Test
	public void noDiscountTest() throws Exception {
		double km = 100;
		int age = 18;
		double priceNoDiscount = PRICE_FOR_KM * km;
		c = new Ticket(km,age);
		
		assertEquals(priceNoDiscount, c.getFullPrice(), "Price without discount not correct");
	}
	
	@Test
	public void discountOver() throws Exception{
		double km = 100;
		int age = 65;
		double priceOverDiscount = (PRICE_FOR_KM * km) * OVER_DISCOUNT;
		c = new Ticket(km,age);
		
		assertEquals(priceOverDiscount, c.getFullPrice(), "Price with discount over 65 not correct");
	}
	
	@Test
	public void discountUnder() throws Exception{
		double km = 100;
		int age = 17;
		double priceUnderDiscount = (PRICE_FOR_KM * km) * UNDER_DISCOUNT;
		c = new Ticket(km,age);
		
		assertEquals(priceUnderDiscount, c.getFullPrice(), "Price with discount under 18 not correct");
	}
}