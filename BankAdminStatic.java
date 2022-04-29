



public class BankAdminStatic {
	void autherizedToChangeMobileNumber(BankAccStatic ref, String newNumber)
	{
			ref.setMobileNo(newNumber);
			System.out.println("mobile number changed....");
	}
	void autherizedToChangeAccountHolderName(BankAccStatic ref, String newName)
	{
		ref.setAccountholderName(newName);
		System.out.println("name changed....");
	}
	void autherizedToDepositAmount(BankAccStatic ref, double amountToDeposit)
	{
		double currentBalance = ref.getBalance();
		double newBalance = currentBalance + amountToDeposit;
		ref.setBalance(newBalance);
		System.out.println("Deposit successful....");
	}
	void autherizedToWithdrawAmount(BankAccStatic ref, double amountToWithdraw)
	{
		double currentBalance = ref.getBalance();
		double newBalance = currentBalance - amountToWithdraw;
		ref.setBalance(newBalance);
		System.out.println("Withdraw successful....");
	}
	void autherizedToTransferAmount(BankAccStatic src,BankAccStatic trg, double amountToTransfer)
	{
		double sourceBalance = src.getBalance() - amountToTransfer;
		double targetBalance = trg.getBalance() + amountToTransfer;
		src.setBalance(sourceBalance);
		trg.setBalance(targetBalance);
		System.out.println("Transfer successful....");
	}

}
