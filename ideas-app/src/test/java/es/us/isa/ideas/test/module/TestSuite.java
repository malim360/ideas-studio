package es.us.isa.ideas.test.module;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import es.us.isa.ideas.test.utils.TestCase;

/**
 * TestModule group class
 * 
 * @author feserafim
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	es.us.isa.ideas.test.module.iagree.TestSuite.class
//	es.us.isa.ideas.test.module.html.TestSuite.class,
//	es.us.isa.ideas.test.module.lusdl.TestSuite.class
})
public class TestSuite {

	private static final Logger LOG = Logger.getLogger(TestSuite.class
			.getName());

	@BeforeClass
	public static void setUp() throws InterruptedException {

		LOG.log(Level.INFO, "Starting TestSuiteModule...");

		TestCase.logout();
		TestCase.login();

	}

	@AfterClass
	public static void tearDown() {
		LOG.log(Level.INFO, "TestSuiteModule finished");
	}

}