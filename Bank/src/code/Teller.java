package code;

public class Teller {

	private OpenAccountRequest openAccountRequest;
	private WithdrawMoneyRequest withdrawMoneyRequest;

	public Teller(OpenAccountRequest openAccountRequest,
			WithdrawMoneyRequest withdrawMoneyRequest) {
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
