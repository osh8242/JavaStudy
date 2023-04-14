
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.addAccount("10071", "백");
		bank.addAccount("890113", "택");
		bank.addAccount("0113", "택");
		bank.addAccount("9876543321", "두팔");
		bank.getAccounts();
		bank.getAccount("890113").deposit(200000);
		bank.getAccount("890113").deposit(400000);
		bank.findAccounts("택");
		bank.getAccount("");
		bank.findAccounts("");
		bank.getAccount("890113").withdraw(5500);
		bank.getAccount("890113").getTransactions();
	}
}
