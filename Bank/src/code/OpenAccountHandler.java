/**
 * 
 */
package code;

/**
 * @author oded
 *
 */
public class OpenAccountHandler {

	private Display display;
	private BackgroundCheck backGroundCheck;
	private Accounts accounts;

	public OpenAccountHandler(Accounts accounts,
			BackgroundCheck backGroundCheck, Display display) {
		this.accounts = accounts;
		this.backGroundCheck = backGroundCheck;
		this.display = display;
	}

	public Boolean openAccount(String string) {
		if(!backGroundCheck.result(string)){
			display.displayString("Sorry request refused");
			return false;
		}
		Integer accountNumber = accounts.openNewAccount();
		display.displayString("Request accepted. New account number is: " + accountNumber);		
		return true;
	}

}
