package code;

public class Teller {

	private OpenAccountHandler openAccountRequest;
	private WithdrawMoneyHandler withdrawMoneyRequest;

	public Teller(OpenAccountHandler openAccountRequest,
			WithdrawMoneyHandler withdrawMoneyRequest) {
		this.openAccountRequest = openAccountRequest;
		this.withdrawMoneyRequest = withdrawMoneyRequest;
	}

	public boolean openAccount(String string) {
		return openAccountRequest.openAccount(string);
	}

	public boolean withdraw(Integer accountTested, Integer sumTested) {
		return withdrawMoneyRequest.withdraw(accountTested, sumTested);
	}

}
