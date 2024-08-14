package Karthi;
class BankAccount
{
	int Balance=100;
	void Deposit(int amount)
	{
		System.out.println(" Amount"+amount+"deposited ");
	}
	void Withdraw(int amount)
	{
		System.out.println(" Amount"+amount+"Withdrawed");
	}
}
class SavingsAccount extends BankAccount
{
	void Withdraw(int amount)
	{if(Balance>100)
	{
		if(amount<Balance)
			System.out.println("Insufficent Balance");
		else
			System.out.println(" Amount"+amount+"Withdrawed");
	}
	else
		System.out.println("Balance is less Than Rs.100");
	}
}
public class BankLab 
{
	public static void main(String [] args)
	{
		BankAccount b1=new SavingsAccount();
		b1.Withdraw(1000);
	}

}
