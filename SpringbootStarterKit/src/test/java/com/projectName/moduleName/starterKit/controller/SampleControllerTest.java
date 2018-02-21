package com.projectName.moduleName.starterKit.controller;

import org.junit.*;
import static org.junit.Assert.*;
import com.projectName.moduleName.starterKit.Exceptions.UserIdNotFoundException;
import com.projectName.moduleName.starterKit.restTemplate.CallAPI;
import com.projectName.moduleName.starterKit.service.SampleService;

/**
 * The class <code>SampleControllerTest</code> contains tests for the class <code>{@link SampleController}</code>.
 *
 * @generatedBy CodePro at 2/20/18 5:33 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class SampleControllerTest {
	/**
	 * Run the String getAppMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test
	public void testGetAppMode_1()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";

		String result = fixture.getAppMode();

		// add additional test code here
		assertEquals("", result);
	}

	
	@Test
	public void testHelloGet_1()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";
		String name = "a";

		String result = fixture.helloGet(name);

		// add additional test code here
		assertEquals("Hello a. Your application is running on  mode.", result);
	}

	/**
	 * Run the String helloGet(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test(expected = com.projectName.moduleName.starterKit.Exceptions.UserIdNotFoundException.class)
	public void testHelloGet_2()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";
		String name = "";

		String result = fixture.helloGet(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String helloPost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test
	public void testHelloPost_1()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";
		String name = "";

		String result = fixture.helloPost(name);

		// add additional test code here
		assertEquals("Hello . Your application is running on  mode.", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
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
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
}