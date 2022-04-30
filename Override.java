import java.time.LocalDate;

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ao = new Account();
		ao.withdraw(500);
		 System.out.println("object is pointing to"+ao.hashCode());
		SavingsAccount so = new SavingsAccount();
		so.withdraw(1000);
		 System.out.println("object is pointing to"+so.hashCode());
		FixedDepositAccount fo = new FixedDepositAccount();
		fo.withdraw(2000);
		 System.out.println("object is pointing to"+fo.hashCode());
		 System.out.println("-------------------------------------");
		Account asf;
		asf = new SavingsAccount();
		asf.withdraw(200);//
		 System.out.println("object is pointing to"+asf.hashCode());
		asf = new FixedDepositAccount();
		asf.withdraw(800);
		System.out.println("object is pointing to"+asf.hashCode());
		
		System.out.println("-------------------------------------------");

		// Account ac=new Account();
		if (ao instanceof Account) {
			System.out.println("ao ref is pointing to " + ao.getClass());
		} else if (ao instanceof SavingsAccount) {
			System.out.println("ao ref is pointing to" + ao.getClass());
		}

		if (so instanceof Account) {
			System.out.println("so ref is pointing to " + so.getClass());
		} else if (so instanceof SavingsAccount) {
			System.out.println("so ref is pointing to" + so.getClass());
		}

		if (fo instanceof Account) {
			System.out.println("fo ref is pointing to " + fo.getClass());
		} else if (fo instanceof SavingsAccount) {
			System.out.println("fo ref is pointing to" + fo.getClass());
		} /*else if (fo instanceof FixedDepositAccount) {
			System.out.println("fo ref is poiting to" + fo.getClass());
		}*/
		System.out.println("----------------------------");
		if (asf instanceof Account) {
			System.out.println("asf ref is pointing to " + asf.getClass());
		} else if (asf instanceof SavingsAccount) {
			System.out.println("asf ref is pointing to" + asf.getClass());
		}
		 else if (asf instanceof FixedDepositAccount) {
			System.out.println("asf ref is pointing to" + asf.getClass());
		}

	}

}

abstract class Withdrawing // partial class -
{
	abstract void withdraw(float amt); // declared - not defined
}

/*
 * class Recurring extends Withdrawing { void withdraw(float x) {
 * 
 * } }
 */
class Account extends Withdrawing { // isA
	float balance = 5000;

	void withdraw(float y) { // 1. inherited
		System.out.println("Account:withdraw()");
		balance = balance - y;
	}
}

class SavingsAccount extends Account {

	void calculateSimpleInterest() {// 2. exclusive

	}
	
	 void withdraw(float a) {//3. overriding
	 System.out.println("SavingsAccount:withdraw()"); if(balance < a) { throw new
	 RuntimeException("funds insufficient..."); } balance=balance-a; }
	
}

class FixedDepositAccount extends SavingsAccount {
	int tenureYear = 2022;

	
	 void withdraw(float a) { int currentYear = LocalDate.now().getYear();
	 if(tenureYear != currentYear) { throw new
	 RuntimeException("Account not matured...cannot withdraw...."); }
	 System.out.println("FixedDepositAccount:withdraw()"); balance=balance-a; }
	 
	void withdrawing(float a) {
	}// exclusive
}
