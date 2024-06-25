package org.ContractPod.Day11OopsPrograms;
class Account
{
	private String accName;
	private String accNumber;
	private double accBalence;
	Account(String accName, String accNumber, double accBalence) 
	{
		this.accName = accName;
		this.accNumber = accNumber;
		this.accBalence = accBalence;
	}
	public double WithDraw(double withdrawMoney)
	{
		if(withdrawMoney<= accBalence)
		{
			accBalence = accBalence - withdrawMoney;
			
		}
		else
		{
			System.out.println("Debit amount exceeded account balance.");
		}
		return  accBalence;
	}
	public void PrintAccount()
	{
		System.out.println("Account Details are");
		System.out.println("Account Name:- "+ accName);
		System.out.println("Account Number:- "+accNumber);
		System.out.println("Account Balence:- "+accBalence);
	}
	
}
public class AccountTest 
{
	static
	{
		System.out.println("welcome to SBI");
	}

	public static void main(String[] args) 
	{
		Account a = new Account("Gaurav", "38499144352", 450000.00);
		a.WithDraw(10000);
		a.PrintAccount();
		
	}

}
