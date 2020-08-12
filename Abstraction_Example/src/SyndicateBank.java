
public class SyndicateBank extends ATM {

	public String BankAccountNumber; 
	public int cash; 
	public int credit;
	public int CurrentBalance = 25000;
	
	public SyndicateBank(String AccountNum, int cash, int creditBal) {
		// TODO Auto-generated method stub
		this.BankAccountNumber = AccountNum; 
		this.cash = cash;
		this.credit = creditBal;
		
	}

	@Override
	public int Withdrawal() {
		// TODO Auto-generated method stud
		int WithdrawalMoney = 0;
		if(BankAccountNumber == "5678")
		{
			WithdrawalMoney = CurrentBalance - credit; 		
		}
		else {
			return 0;
		}
		return WithdrawalMoney;
	}

	@Override
	int MoneyDeposit() {
		// TODO Auto-generated method stub
		int depositCash = CurrentBalance + cash; 
		return depositCash;
	}

		@Override
		String miniStmt() {
			// TODO Auto-generated method stub
			CurrentBalance = (CurrentBalance - credit)+cash;
			
			if(BankAccountNumber == "5673")
			{
			return "Mini Statement from SyndicateBank: "
					+ "Balance: " + CurrentBalance;
			}
			else {
				return "Invalid account";
			}
		}

}
