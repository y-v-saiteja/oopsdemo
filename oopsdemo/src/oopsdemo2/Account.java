 package oopsdemo2;
  //multilevel inheritance
public class Account {     //base class for Savings account
	int accNo;
	String name;
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
  void display()
  {
	   System.out.println("********* Account Details ***********");
       System.out.println("account number  :" + accNo);
       System.out.println("name :" + name);
  }
}
