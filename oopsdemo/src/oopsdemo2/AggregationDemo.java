package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		
    Address ad1=new Address("benglore","karnataka","india",566016);
    Address ad2=new Address("kadapa","AP","india",516247);
    
    Student s1=new Student(12,"tej",ad1);
    Student s2=new Student(13,"sai",ad2);
    
	}

}
