package oopsdemo3;

public class TestStatic {

	public static void main(String[] args) {
		
		Student.collegeChange();
		
		Student s1=new Student(101,"sai");
		Student s2=new Student(102,"saj");
		Student s3=new Student(101,"sai tej");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
