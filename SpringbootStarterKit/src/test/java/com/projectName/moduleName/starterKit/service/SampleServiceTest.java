package com.projectName.moduleName.starterKit.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>SampleServiceTest</code> contains tests for the class <code>{@link SampleService}</code>.
 *
 * @generatedBy CodePro at 2/19/18 3:41 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class SampleServiceTest {
	/**
	 * Run the String getAppRunMode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:41 PM
	 */
	@Test
	public void testGetAppRunMode_1()
		throws Exception {
		SampleService fixture = new SampleService();
		String name = "";
		String mode = "";

		String result = fixture.getAppRunMode(name, mode);

		// add additional test code here
		assertEquals("Hello . Your application is running on  mode.", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/19/18 3:41 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/19/18 3:41 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
	
}