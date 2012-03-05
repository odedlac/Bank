/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.Accounts;
import code.Display;
import code.Money;
import code.WithdrawMoneyRequest;

/**
 * @author oded
 *
 */
public class WithdrawMoneyRequestTest {

	private WithdrawMoneyRequest classUnderTest;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUpBeforeClass() throws Exception {
		Accounts accounts = new Accounts();
		accounts.deposit(accounts.openNewAccount(), 100);
		accounts.deposit(accounts.openNewAccount(), 200);
		
		Money money = new Money();
		Display display = new Display();
		
		classUnderTest = new WithdrawMoneyRequest(accounts,money,display);
	}

	@Test
	public void test1() {
		Integer accountTested = 1;
		Integer sumTested = 400;
		
		assertFalse("Gave money when shouldn't have",classUnderTest.withdraw(accountTested,sumTested));
	}
	
	@Test
	public void test2() {
		Integer accountTested = 2;
		Integer sumTested = 100;
		
		assertTrue("Did not give money when should have",classUnderTest.withdraw(accountTested,sumTested));
	}

}
