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
import code.Money;
import code.OpenAccountRequest;
import code.Teller;
import code.WithdrawMoneyRequest;

/**
 * @author oded
 *
 */
public class TellerTest {

	private Teller classUnderTest;
	
	@Before
	public void setUpBeforeClass(){
		Accounts accounts = new Accounts();
		accounts.deposit(accounts.openNewAccount(), 100);
		accounts.deposit(accounts.openNewAccount(), 200);
		
		Money money = new Money();
		Display display = new Display();
		BackgroundCheck backGroundCheck  = new BackgroundCheck();

		WithdrawMoneyRequest withdrawMoneyRequest = new WithdrawMoneyRequest(accounts,money,display);
		OpenAccountRequest openAccountRequest = new OpenAccountRequest(accounts,backGroundCheck,display);		
		
		classUnderTest = new Teller(openAccountRequest,withdrawMoneyRequest);
		
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
		Integer accountTested = 1;
		Integer sumTested = 400;
		
		assertFalse("Gave money when shouldn't have",classUnderTest.withdraw(accountTested,sumTested));
	}

	@Test
	public void test4() {
		Integer accountTested = 2;
		Integer sumTested = 100;
		
		assertTrue("Did not give money when should have",classUnderTest.withdraw(accountTested,sumTested));
	}

	
	
}
