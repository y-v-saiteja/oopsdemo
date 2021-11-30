package oopsdemo2;

class Staff	
{
	private int empId;
	private String name;
	protected float salary,hra;
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	 void getHRA()
	 {
		 hra=(salary*60)/100;
		 System.out.println("HRA:"+hra);
	 }
	 void display()
	 {
		
		 System.out.println(empId+" "+name+" "+salary);
	 }
}

 class manager extends  Staff
 {
    protected float da;
    private float gross;
	public manager(int empid, String name, float salary) {
		super(empid, name, salary);
		
	}
	  void getDA()
	  {
		  da=(salary*80)/100;
		  System.out.println("DA:"+da);
	  }
	  void getGross()
	  {
		  gross=salary+hra+da;
		  System.out.println("gross salatry of manager:"+gross);
	  }
	  
	  
 }
/* staff ----->manager------->director  */
  class Director extends manager
  {
     private float ta,gross;
	public Director(int empid, String name, float salary) {
		super(empid, name, salary);
		// TODO Auto-generated constructor stub
	}
	 
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA:"+ta);
	}
	  void getGross()
	  {
		  gross=salary+hra+da+ta;
		  System.out.println("gross salatry of director:"+gross);
	  }
  }

public class MultiLevel2 {

	public static void main(String[] args) {
	Director d1=new Director(100,"sai",5000);
	System.out.println("********** Director details********");
	d1.display();  //invoking staff
	d1.getHRA(); //invoking staff
	d1.getDA(); //INVOKING manager
	d1.getTA();// invoking director
	d1.getGross();
	
	manager m1=new manager(201,"tej",4000);
	System.out.println("********manager details*******");
	m1.display();
	m1.getHRA();
	m1.getDA();
	m1.getGross();
	
	 Staff s1=new Staff(301,"mike",2000);
	 System.out.println("********staff details*******");
	 s1.display();
	 s1.getHRA();
	 
	
	}

}
