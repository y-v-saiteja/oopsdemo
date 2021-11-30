package oopsdemo2;
/* multi level inheritance
 *  	 Account  --- > SavingsBank ---> AccountDetails
 */

public class AccountDetails extends SavingsBank //child class of savingsbank
{
       int withdrawl,deposit,finalBalance;
       
	public AccountDetails(int accNo, String name, int mb, int b,int w,int d) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=d;
				
	}
	void display()
    {
            super.display();
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(bal+deposit)-withdrawl;
            System.out.println("finalbalance"+finalBalance);
            
    }

}
