package com.projectName.moduleName.starterKit.models;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MongoSampleModelTest</code> contains tests for the class <code>{@link MongoSampleModel}</code>.
 *
 * @generatedBy CodePro at 2/19/18 3:27 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class MongoSampleModelTest {
	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		MongoSampleModel obj = new MongoSampleModel();
		obj.setMyValue("");
		obj.setUniqueID("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		MongoSampleModel obj = new MongoSampleModel();
		obj.setMyValue("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		MongoSampleModel obj = new MongoSampleModel();
		obj.setMyValue("");
		obj.setUniqueID("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		MongoSampleModel obj = new MongoSampleModel();
		obj.setMyValue("");
		obj.setUniqueID("");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID((String) null);
		MongoSampleModel obj = new MongoSampleModel();
		obj.setMyValue("");
		obj.setUniqueID((String) null);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String getMyValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testGetMyValue_1()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");

		String result = fixture.getMyValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUniqueID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testGetUniqueID_1()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");

		String result = fixture.getUniqueID();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue((String) null);
		fixture.setUniqueID("");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID((String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(961, result);
	}

	/**
	 * Run the void setMyValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testSetMyValue_1()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		String myValue = "";

		fixture.setMyValue(myValue);

		// add additional test code here
	}

	/**
	 * Run the void setUniqueID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@Test
	public void testSetUniqueID_1()
		throws Exception {
		MongoSampleModel fixture = new MongoSampleModel();
		fixture.setMyValue("");
		fixture.setUniqueID("");
		String uniqueID = "";

		fixture.setUniqueID(uniqueID);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/19/18 3:27 PM
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
	 * @generatedBy CodePro at 2/19/18 3:27 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
}