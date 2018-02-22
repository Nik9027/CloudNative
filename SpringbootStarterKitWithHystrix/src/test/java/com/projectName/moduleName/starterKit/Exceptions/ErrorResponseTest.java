package com.projectName.moduleName.starterKit.Exceptions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ErrorResponseTest</code> contains tests for the class <code>{@link ErrorResponse}</code>.
 *
 * @generatedBy CodePro at 2/20/18 12:49 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class ErrorResponseTest {
	/**
	 * Run the ErrorResponse(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 12:49 PM
	 */
	@Test
	public void testErrorResponse_1()
		throws Exception {
		String code = "";
		String message = "";

		ErrorResponse result = new ErrorResponse(code, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMessage());
		assertEquals("", result.getCode());
	}

	/**
	 * Run the String getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 12:49 PM
	 */
	@Test
	public void testGetCode_1()
		throws Exception {
		ErrorResponse fixture = new ErrorResponse("", "");

		String result = fixture.getCode();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 12:49 PM
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		ErrorResponse fixture = new ErrorResponse("", "");

		String result = fixture.getMessage();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 12:49 PM
	 */
	@Test
	public void testSetCode_1()
		throws Exception {
		ErrorResponse fixture = new ErrorResponse("", "");
		String code = "";

		fixture.setCode(code);

		// add additional test code here
	}

	/**
	 * Run the void setMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 12:49 PM
	 */
	@Test
	public void testSetMessage_1()
		throws Exception {
		ErrorResponse fixture = new ErrorResponse("", "");
		String message = "";

		fixture.setMessage(message);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/20/18 12:49 PM
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
	 * @generatedBy CodePro at 2/20/18 12:49 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

		}