import java.util.ArrayList;
import java.util.Calendar;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}
	
	public void deposit(long amount) {
		balance += amount;
		System.out.println(amount + "원 을 입금하셨습니다.");
		System.out.println("현재 잔액은 "+balance+"원 입니다.\n");
		Calendar now = Calendar.getInstance();
		String date = now.get(Calendar.YEAR)+"년"+(now.get(Calendar.MONTH)+1)+"월"+now.get(Calendar.DAY_OF_MONTH)+"일";
		String time = now.get(Calendar.HOUR)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);
		transactions.add(new Transaction(date, time, "deposit", amount, balance));
	}
	
	public void withdraw(long amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원 을 출금하셨습니다.");
		System.out.println("현재 잔액은 "+balance+"원 입니다.\n");
		Calendar now = Calendar.getInstance();
		String date = now.get(Calendar.YEAR)+"년"+(now.get(Calendar.MONTH)+1)+"월"+now.get(Calendar.DAY_OF_MONTH)+"일";
		String time = now.get(Calendar.HOUR)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);
		transactions.add(new Transaction(date, time, "withdraw", amount, balance));
	}
	
	public long getBalance() {
		
		return this.balance;
	}
	
	public ArrayList<Transaction> getTransactions() {
		for (Transaction ta : transactions) {
			System.out.println(ta.toString());
		}
		return transactions;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	 @Override
	  public String toString() {
	    StringBuffer sb = new StringBuffer();	    
	    sb.append("[계좌번호:"+accountNo);
	    sb.append(", ");
	    sb.append("소유자명:"+name);
	    sb.append(", ");
	    sb.append("잔액:"+balance+"]");
	    return sb.toString();
	  }
}
