package com.projectName.moduleName.starterKit.restTemplate;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;


import static org.junit.Assert.*;

/**
 * The class <code>CallAPITest</code> contains tests for the class <code>{@link CallAPI}</code>.
 *
 * @generatedBy CodePro at 2/15/18 5:47 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class CallAPITest {
	
	@InjectMocks
	CallAPITest callAPITest;
	
	@Mock
	RestTemplate restTemplate;
	
	 @Before
	    public void setupMock() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	
	@Test
	public void testCallAPI_1()
		throws Exception {
		CallAPI result = new CallAPI();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String callApiModeEndpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/18 5:47 PM
	 */
	@Test
	public void testCallApiModeEndpoint_1()
		throws Exception {
		
		  //Mockito.when(restTemplate.getForEntity(, responseType));

		CallAPI fixture = new CallAPI();

		String result = fixture.callApiModeEndpoint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on GET request for "http://localhost:0/appMode": connect: Address is invalid on local machine, or port is not valid on remote machine; nested exception is java.net.ConnectException: connect: Address is invalid on local machine, or port is not valid on remote machine
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:674)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:621)
		//       at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:295)
		//       at com.projectName.moduleName.starterKit.restTemplate.CallAPI.callApiModeEndpoint(CallAPI.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the String callApiModeEndpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/15/18 5:47 PM
	 */
	@Test
	public void testCallApiModeEndpoint_2()
		throws Exception {
		CallAPI fixture = new CallAPI();

		String result = fixture.callApiModeEndpoint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.web.client.ResourceAccessException: I/O error on GET request for "http://localhost:0/appMode": connect: Address is invalid on local machine, or port is not valid on remote machine; nested exception is java.net.ConnectException: connect: Address is invalid on local machine, or port is not valid on remote machine
		//       at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:674)
		//       at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:621)
		//       at org.springframework.web.client.RestTemplate.getForObject(RestTemplate.java:295)
		//       at com.projectName.moduleName.starterKit.restTemplate.CallAPI.callApiModeEndpoint(CallAPI.java:32
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/15/18 5:47 PM
	 */
	
}