package com.oracle.peoplesoft.bass2.qe.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.oracle.peoplesoft.bass2.qe.utility.FirstDayAtSchool;

public class AddPencilsTest {
	
	FirstDayAtSchool school = new FirstDayAtSchool();

	String[] bag = { "Books", "Notebooks", "Pens", "Pencils" };

	@Test
	public void testAddPencils() {

		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag, school.addPencils());

	}


}
