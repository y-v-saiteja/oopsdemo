package oopsdemo2;

public class Student1 {
	String name;
    int rollNo;
    String className;
    boolean isFromCity;
    
    Student1(String name, int rollNo)
    {
        this.name = name;
        this. rollNo = rollNo;
    }
    
    Student1(String name, int rollNo, String className, boolean isFromCity)
    {
        this.name = name;
        this. rollNo = rollNo;
        this.className = className;
        this.isFromCity = isFromCity;        
    }
    
    public void studentData()
    {
        System.out.println("Name of Student = " + name);
        System.out.println("Roll no = "+ rollNo);
        System.out.println("Class Name = "+ className);
        System.out.println("Is student belongs to city = "+ isFromCity);
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student = new Student1("Ravi", 1);
        student.studentData();
        
        Student1 student2 = new Student1("Ram", 2, "MCA", true);
        student2.studentData();
	}

}
