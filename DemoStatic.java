
public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Branch b1=new Branch();
      //Branch b2=new Branch();
      //b1.setBrCode("8505");
      //b2.setBrCode("9505");
      Account a1=new Account(105, "Arjun", 50000, "7865421589");
      Account a2=new Account(103, "Anand", 50000, "7865421591");
      Account a3=new Account(102, "Anvesh", 50000, "7865421592");
      a1.setBranch("2515");
      a2.setBranch("2515");
      a3.setBranch("2515");
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a3);
      System.out.println("Accounts of Branch :" +a1.getBranch()+" created");
      Account a4=new Account(105, "Arjun", 50000, "7869865129");
      Account a5=new Account(105, "Arjun", 50000, "7685125968");
      Account a6=new Account(105, "Arjun", 50000, "8686518561");
      a4.setBranch("8505");
      a5.setBranch("8505");
      a6.setBranch("8505");
      System.out.println(a4);
      System.out.println(a5);
      System.out.println(a6);
      
      System.out.println("Accounts of Branch :" +a4.getBranch()+" created");
	}

}

/*class Branch{
	public static String brCode;

	public static void setBrCode(String brCode) {
		Branch.brCode = brCode;
	}

	public static String getBrCode() {
		return brCode;
	}
    
}*/
class Account {
	public static String brCode;
	private double accountNumber;
	private String accountholderName;
	private double balance;
	private String mobileNo;
	public Account(double accountNumber, String accountholderName, double balance, String mobileNo) {
		super();//super class default constructor call is automatically done by JVM
		this.accountNumber = accountNumber;
		this.accountholderName = accountholderName;
		this.balance = balance;
		this.mobileNo = mobileNo;
	}
	
	public void setBranch(String brc) {
	   brCode=brc;
		
	}
	public String getBranch() {
		return brCode;
	}
	@Override
	public String toString() {
		return "BankAutomate [accountNumber=" + accountNumber + ", accountholderName=" + accountholderName
				+ ", balance=" + balance + ", mobileNo=" + mobileNo + "]";
	}

	public String getAccountholderName() {
		return accountholderName;
	}
	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	

}
