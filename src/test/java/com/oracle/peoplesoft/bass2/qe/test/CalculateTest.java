package com.oracle.peoplesoft.bass2.qe.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oracle.peoplesoft.bass2.qe.utility.Calculate;

public class CalculateTest {
	
	Calculate calculate=new Calculate();
	int sum=calculate.sum(2, 5);
	int testSum=7;
	@Test
	
	public void testSum() {
		System.out.println("@Test sum(): "+sum+"="+testSum);
		assertEquals(sum, testSum);
	}

}
