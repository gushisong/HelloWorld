package com.oracle.peoplesoft.bass2.qe.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.oracle.peoplesoft.bass2.qe.utility.FirstDayAtSchool;

public class PrepareMyBagTest {
	FirstDayAtSchool school = new FirstDayAtSchool();
	
	String[] bag = { "Books", "Notebooks", "Pens" };

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag, school.prepareMyBag());

	}
	
	@Test(expected=ArithmeticException.class)
//	@Test
	public void divisionWithException() {
		int i=1/0;
	}
	@Test(timeout=1000)
	public void infinity() {
		while(true);
	}
}
