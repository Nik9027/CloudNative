package com.projectName.moduleName.starterKit.Exceptions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserIdNotFoundExceptionTest</code> contains tests for the class <code>{@link UserIdNotFoundException}</code>.
 *
 * @generatedBy CodePro at 2/20/18 5:25 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class UserIdNotFoundExceptionTest {
	/**
	 * Run the UserIdNotFoundException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:25 PM
	 */
	@Test
	public void testUserIdNotFoundException_1()
		throws Exception {
		String name = "";

		UserIdNotFoundException result = new UserIdNotFoundException(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("com.projectName.moduleName.starterKit.Exceptions.UserIdNotFoundException", result.toString());
		assertEquals(null, result.getLocalizedMessage());
		assertEquals(null, result.getMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/20/18 5:25 PM
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
	 * @generatedBy CodePro at 2/20/18 5:25 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	}