package com.projectName.moduleName.starterKit.Exceptions;

import javax.servlet.http.HttpServletRequest;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
import org.springframework.web.util.ContentCachingRequestWrapper;

/**
 * The class <code>GlobalExceptionHandlerTest</code> contains tests for the class <code>{@link GlobalExceptionHandler}</code>.
 *
 * @generatedBy CodePro at 2/20/18 5:33 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class GlobalExceptionHandlerTest {
	/**
	 * Run the GlobalExceptionHandler() constructor test.
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test
	public void testGlobalExceptionHandler_1()
		throws Exception {
		GlobalExceptionHandler result = new GlobalExceptionHandler();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ErrorResponse handleException(HttpServletRequest,Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test
	public void testHandleException_1()
		throws Exception {
		GlobalExceptionHandler fixture = new GlobalExceptionHandler();
		HttpServletRequest request = new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MockHttpServletRequest(), new AnnotationConfigWebApplicationContext()))));
		Exception ex = new Exception();

		ErrorResponse result = fixture.handleException(request, ex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.multipart.MultipartException: Could not parse multipart servlet request; nested exception is java.lang.NoSuchMethodError: javax.servlet.http.HttpServletRequest.getParts()Ljava/util/Collection;
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.parseRequest(StandardMultipartHttpServletRequest.java:112)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:86)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the ErrorResponse handleUserNotFoundException(UserIdNotFoundException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test
	public void testHandleUserNotFoundException_1()
		throws Exception {
		GlobalExceptionHandler fixture = new GlobalExceptionHandler();
		UserIdNotFoundException ex = new UserIdNotFoundException("");

		ErrorResponse result = fixture.handleUserNotFoundException(ex);

		// add additional test code here
		assertNotNull(result);
		assertEquals("The user was not found", result.getMessage());
		assertEquals("USER_NOT_FOUND", result.getCode());
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

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	
}