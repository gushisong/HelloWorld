/**
 * 
 */
package com.oracle.peoplesoft.bass2.qe.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.oracle.peoplesoft.bass2.qe.utility.Constants;
import com.oracle.peoplesoft.bass2.qe.utility.Utils;

/**
 * @author xiaolson
 *
 */
public class TestCase {
	
	private static WebDriver driver;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		driver=Utils.getDriver(Constants.BASS2_URL);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
