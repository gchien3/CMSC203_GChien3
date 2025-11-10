
public class CheckingAccount extends BankAccount{
	private double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		
		String updatedNumber = getAccountNumber() + "-10";
		setAccountNumber(updatedNumber);
	}
	
	@Override
	public boolean withdraw(double amount) {
		double totalAmount = amount + FEE;
		return super.withdraw(totalAmount);
	}
}
