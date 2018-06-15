
/**********************************************

    Workshop 1
    
    Course:<JAC444> - Semester
    
    Last Name:<Ko>
    
    First Name:<Youngmin>
    
    ID:<019155159>
    
    Section:<SAB>
    
    This assignment represents my own work in accordance with Seneca Academic Policy.
    
	Youngmin Ko
    
    Date:<June 08 2018>

**********************************************/
/*

Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method 
to withdraw $2,500, use the deposit method to deposit $3,000, 
and print the balance, the monthly interest, 
and the date when this account was created.
 
*/

public class TestProgram_displayInfo
{
	public static void main(String[] args)
	{
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Date Created: " + account.getDateCreated());
		// or here?
	}
}