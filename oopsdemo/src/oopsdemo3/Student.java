package oopsdemo3;

public class Student {

	 private int rollno;
	 private String name;
	 private static String college="AITS";
	 
	 
	 static void collegeChange()
	 {
		 college="AITS=R";
		 
	 }


	public Student(int rollno, String name) {		
		this.rollno = rollno;
		this.name = name;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	 
}
