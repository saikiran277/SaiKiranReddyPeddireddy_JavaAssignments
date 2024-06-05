package ey.com.Day6;

public class AccountChecker {
	private BankAccount[] accounts;
	
	public AccountChecker() {
		accounts = new BankAccount[5];
		try {
			accounts[0] = new BankAccount(101,"Sai","Savings",10000);
			accounts[1] = new BankAccount(102,"Murali","Current",7000);
			accounts[2] = new BankAccount(103,"Chaitanya","Savings",1500);
			accounts[3] = new BankAccount(104,"Chanikya","Current",1100);
			accounts[4] = new BankAccount(105,"Meher","Savings",5000);
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}
	
	public boolean isValidAccount(int accno) throws AccountNotFoundException {
		for(BankAccount account :accounts) {
			if(account!=null && account.getAccno()==accno)
				return true;
		}
		throw new AccountNotFoundException("Account with Acc no "+accno+" not found");
	}
	
	public static void main(String[] args) {
		AccountChecker checker = new AccountChecker();
		int[] testAccountNumbers = {101,108,102,111,103};
		
		for(int accno:testAccountNumbers) {
			try {
				if(checker.isValidAccount(accno))
					System.out.println("Account number "+accno+" is valid");
			} 
			catch (AccountNotFoundException e) {
				System.out.println("Exception : "+e.getMessage());
			}
		}
	}
}