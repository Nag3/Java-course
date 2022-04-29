
public class BankingStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccStatic bankObjArray[] = {
				new BankAccStatic(501, "Ramesh", 50000, "3820443464"),
				new BankAccStatic(602, "Suresh", 60000, "3820443464"),
			    new BankAccStatic(703, "Naresh", 70000, "3820443464"),
			    new BankAccStatic(804, "Mahesh", 80000, "3820443464")
			};
			for (int i = 0; i < bankObjArray.length; i++) {
				System.out.println(bankObjArray[i]);
			}
			
			
			BankAccStatic ba1 = new BankAccStatic(101, "Jack", 50000, "9820443464");
			BankAccStatic ba2 = new BankAccStatic(102, "Jane", 60000, "8820443464");
			BankAccStatic ba3 = new BankAccStatic(103, "Jill", 70000, "6820443464");
			BankAccStatic ba4 = new BankAccStatic(104, "Jimy", 80000, "7820443464");
			
			System.out.println(ba1);
			System.out.println(ba2);
			System.out.println(ba3);
			System.out.println(ba4);
			
			System.out.println("-----------------");
			
			BankAdminStatic admin= new BankAdminStatic();
			admin.autherizedToChangeMobileNumber(ba1, "1231231231");
			admin.autherizedToChangeMobileNumber(ba2, "2231231231");
			admin.autherizedToChangeMobileNumber(ba3, "3231231231");
			admin.autherizedToChangeMobileNumber(ba4, "4231231231");
			
			System.out.println(ba1);
			System.out.println(ba2);
			System.out.println(ba3);
			System.out.println(ba4);

			System.out.println("--------------");
			admin.autherizedToChangeAccountHolderName(ba1,"Jackson");
			System.out.println(ba1);
			
			admin.autherizedToTransferAmount(ba1, ba2, 50000);
			System.out.println(ba1);
			System.out.println(ba2);
	}

}
