package com.projectName.moduleName;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 2/20/18 5:33 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SwaggerConfigTest.class,
	SpringbootStarterKitApplicationTest.class,
	com.projectName.moduleName.starterKit.TestAll.class,
})
public class TestAll {

	
}
