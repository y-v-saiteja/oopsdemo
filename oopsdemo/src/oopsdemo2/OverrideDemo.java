package oopsdemo2;


 class Bank
 {
	 int getRateofIntrest()
	 {
		 return 0;
	 }
	 
	 void display()
	 {
		 System.out.println("welcome to bank");
	 }
 }
  
 class SBI extends Bank
 {
	 int getRateofIntrest()   //overriddden method
	 {
		 return 5;
	 }
 }
 
 class ICICI extends Bank
 {
	 int getRateofIntrest()   // method overriddden IN CHILD CLASS
	 {
		 return 7;
	 }
 }
 
 class AXIS extends Bank
 {
	 int getRateofIntrest()   // method overriddden IN CHILD CLASS
	 {
		 return 6;
	 }
 }
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		AXIS b3=new AXIS();
		
		b1.display();
		System.out.println("the intrest rate of SBI is:"+b1.getRateofIntrest());
		
		b2.display();
		System.out.println("the intrest rate of ICICI is:"+b2.getRateofIntrest());		
		
		b3.display();
		System.out.println("the intrest rate of AXIX is:"+b3.getRateofIntrest());
	}

}
