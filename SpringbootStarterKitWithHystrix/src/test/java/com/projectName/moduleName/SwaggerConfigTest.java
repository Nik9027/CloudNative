package com.projectName.moduleName;

import org.junit.*;
import static org.junit.Assert.*;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * The class <code>SwaggerConfigTest</code> contains tests for the class <code>{@link SwaggerConfig}</code>.
 *
 * @generatedBy CodePro at 2/19/18 3:50 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class SwaggerConfigTest {
	/**
	 * Run the Docket api() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:50 PM
	 */
	@Test
	public void testApi_1()
		throws Exception {
		SwaggerConfig fixture = new SwaggerConfig();

		Docket result = fixture.api();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
		assertEquals("default", result.getGroupName());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/19/18 3:50 PM
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
	 * @generatedBy CodePro at 2/19/18 3:50 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
}