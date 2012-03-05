/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.Accounts;
import code.BackgroundCheck;
import code.Display;
import code.OpenAccountHandler;

/**
 * @author oded
 *
 */
public class OpenAccountHandlerTest {

	private  OpenAccountHandler classUnderTest;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUpBeforeClass() throws Exception {
		Accounts accounts = new Accounts();
		BackgroundCheck backGroundCheck  = new BackgroundCheck();
		Display display = new Display();
		
		classUnderTest = new OpenAccountHandler(accounts,backGroundCheck,display);
	}

	@Test
	public void test1() {
		assertFalse("Opened account when shouldn't", classUnderTest.openAccount("Oded"));
	}
	@Test
	public void test2() {
		assertTrue("Opened account when shouldn't", classUnderTest.openAccount("Ode"));
	}
	@Test
	public void test3() {
		assertTrue("Opened account when shouldn't", classUnderTest.openAccount("Edo"));
	}


}
