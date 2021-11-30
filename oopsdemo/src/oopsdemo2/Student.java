package oopsdemo2;

public class Student {
	int rollno;
	String name;
	 Address ad; //entity reference --aggregation- has a relationship
	public Student(int rollno, String name, Address ad) {
		this.rollno = rollno;
		this.name = name;
		this.ad = ad;
	}
	 
	 void display()
	 {
		 System.out.println("************Student details***********");
		 System.out.println("student id :"+rollno);
		 System.out.println("student name:"+name);
		 System.out.println("address: "+ad.city+" "+ad.state+" "+ad.country+" "
		 +ad.pincode);
		 
	 }

}
