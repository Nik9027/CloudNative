package com.projectName.moduleName.starterKit.filter;

import static org.junit.Assert.assertNotNull;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockFilterConfig;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

/**
 * The class <code>ApplicationFilterTest</code> contains tests for the class <code>{@link ApplicationFilter}</code>.
 *
 * @generatedBy CodePro at 2/19/18 3:44 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class ApplicationFilterTest {
	/**
	 * Run the ApplicationFilter() constructor test.
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	@Test
	public void testApplicationFilter_1()
		throws Exception {
		ApplicationFilter result = new ApplicationFilter();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		ApplicationFilter fixture = new ApplicationFilter();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	@Test
	public void testDoFilter_1()
		throws Exception {
		ApplicationFilter fixture = new ApplicationFilter();
		ServletRequest request = new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MockHttpServletRequest(), new AnnotationConfigWebApplicationContext()))));
		ServletResponse response = new ContentCachingResponseWrapper(new MockHttpServletResponse());
		FilterChain filterChain = new MockFilterChain();

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.multipart.MultipartException: Could not parse multipart servlet request; nested exception is java.lang.NoSuchMethodError: javax.servlet.http.HttpServletRequest.getParts()Ljava/util/Collection;
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.parseRequest(StandardMultipartHttpServletRequest.java:112)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:86)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:73)
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	@Test
	public void testDoFilter_2()
		throws Exception {
		ApplicationFilter fixture = new ApplicationFilter();
		ServletRequest request = new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MockHttpServletRequest(), new AnnotationConfigWebApplicationContext()))));
		ServletResponse response = new ContentCachingResponseWrapper(new MockHttpServletResponse());
		FilterChain filterChain = new MockFilterChain();

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.multipart.MultipartException: Could not parse multipart servlet request; nested exception is java.lang.NoSuchMethodError: javax.servlet.http.HttpServletRequest.getParts()Ljava/util/Collection;
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.parseRequest(StandardMultipartHttpServletRequest.java:112)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:86)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:73)
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	@Test
	public void testDoFilter_3()
		throws Exception {
		ApplicationFilter fixture = new ApplicationFilter();
		ServletRequest request = new DefaultMultipartHttpServletRequest(new StandardMultipartHttpServletRequest(new ContentCachingRequestWrapper(new ContextExposingHttpServletRequest(new MockHttpServletRequest(), new AnnotationConfigWebApplicationContext()))));
		ServletResponse response = new ContentCachingResponseWrapper(new MockHttpServletResponse());
		FilterChain filterChain = new MockFilterChain();

		fixture.doFilter(request, response, filterChain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.multipart.MultipartException: Could not parse multipart servlet request; nested exception is java.lang.NoSuchMethodError: javax.servlet.http.HttpServletRequest.getParts()Ljava/util/Collection;
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.parseRequest(StandardMultipartHttpServletRequest.java:112)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:86)
		//       at org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.<init>(StandardMultipartHttpServletRequest.java:73)
	}

	/**
	 * Run the void init(FilterConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		ApplicationFilter fixture = new ApplicationFilter();
		FilterConfig arg0 = new MockFilterConfig();

		fixture.init(arg0);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/19/18 3:44 PM
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
	 * @generatedBy CodePro at 2/19/18 3:44 PM
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
	 * @generatedBy CodePro at 2/19/18 3:44 PM
	 */
	
}