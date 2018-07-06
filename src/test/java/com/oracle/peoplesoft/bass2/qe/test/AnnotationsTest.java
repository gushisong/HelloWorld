package com.oracle.peoplesoft.bass2.qe.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsTest {
	
	private ArrayList testList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass: onceExecutedBeforeAll");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass: onceExecutedAfterAll");
		
	}

	@Before
	public void setUp() throws Exception {
		testList=new ArrayList();
		System.out.println("@Before: executedBeforeEach");
	}

	@After
	public void tearDown() throws Exception {
		testList.clear();
		System.out.println("@After: executedAfterEach");
	}

	@Test
	public void EmptyCollection() {
		assertTrue(testList.isEmpty());
		System.out.println("@Test: EmptyArrayList");
	}
	
	@Test
	public void OneItemCollection() {
		testList.add("oneItem");
		assertEquals(1, testList.size());
		System.out.println("@Test: OneItemArrayList");
		
	}
	@Test
	@Ignore
	public void executionIgnored() {

		System.out.println("@Ignore: This execution is ignored");
	}
	
	

}
