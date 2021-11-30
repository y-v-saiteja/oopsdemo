package oopsdemo3;
// multiple interface implementation
public class StudentDetails implements CollegeData,HostelData {
	
	College c1=new College("tej",200,"jntu university","BTECH");
	Hostel h1=new Hostel("svr","block 1");
	

	
	@Override
	public void HostelDetail() {
		System.out.println("*************hosteldetails**********");
		System.out.println("hostelname:"+h1.getName());
		System.out.println("location:"+h1.getLocation());
		
	}

	@Override
	public void studentRecord() {
	System.out.println("Student selected based on percentage & financial situation");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("************college details*******");
		System.out.println("college name:"+c1.getName());
		System.out.println("college id:"+c1.getId());
		System.out.println("course:"+c1.getCourse());
		System.out.println("university:"+c1.getUniversity());
		
		
	}

	@Override
	public void studentData() {
		// TODO Auto-generated method stub
		System.out.println("student can join courses:MCA,MTECH,BTECH");
		
	}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	StudentDetails s1=new StudentDetails();
	s1.collegeDetail();
	s1.studentData();
	s1.HostelDetail();
	s1.studentRecord();
	

}
}

