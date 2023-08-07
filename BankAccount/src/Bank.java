import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	private int totalAccount;
	
	public Bank() {
		this.accounts = new ArrayList<Account>();
		this.totalAccount = 0;
	}
	
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
		totalAccount++;
	}
	
	public Account getAccount(String accountNo) {
		for (Account acc : accounts) {
			if(acc.getAccountNo().equals(accountNo)){
				System.out.println(acc.toString());
				return acc;
			}
		}
		return null;
	}
	
	public ArrayList<Account> findAccounts(String name) {
		System.out.println("= 해당 계좌번호의 계좌정보 =\n");
		ArrayList<Account> temp = new ArrayList<Account>();
		for (Account acc : accounts) {
			if(acc.getName().equals(name)) {
				temp.add(acc);
			}
		}
		return temp;
	}
	
	public List<Account> getAccounts() {
		System.out.println("= 전체 계좌 목록 =");
		for (Account acc : accounts) {
			System.out.println(acc.toString());
		}
		System.out.println();
		return accounts;
	}

	public int getTotalAccount() {
		for (Account acc : accounts) {
			System.out.println(acc.toString());
		}	
		return totalAccount;
	}
	
	

}
