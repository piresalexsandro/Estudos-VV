
public class TestAccountAgency {

	public static void main(String[] args) {

		BankAgency bkag = new BankAgency(8201);
		BankAccount bkac = new BankAccount(bkag);
		
		
		//bkag.agencyNum = 8201;
		bkac.accountNum = 14879;
		bkac.accountBalance = 42654.21;
		bkac.accountLimit = 373245.83;
		
		
		System.out.println("Agency Number..: " + bkag.agencyNum);
		System.out.println("Account Number.: " + bkac.accountNum);
		System.out.println("Account Balance: " + bkac.accountBalance);
		System.out.println("Account Limit..: " + bkac.accountLimit);
		
		bkac.bankAgency = bkag;
		System.out.println();
		System.out.println("Agency Number..: " + bkac.bankAgency.agencyNum);

	}

}
