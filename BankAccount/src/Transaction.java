
public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("거래날짜 "+transactionDate);
	    sb.append(", ");
	    sb.append("거래시간 "+transactionTime);
	    sb.append(", ");
	    sb.append("구분 "+kind);
	    sb.append(", ");
	    sb.append("거래금액 "+amount);
	    sb.append(", ");
	    sb.append("계좌잔고 "+balance);

	    return sb.toString();
	  }		
}
