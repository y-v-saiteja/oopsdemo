package oopsdemo2;
// java program to implement HIERARCHIAL Inheritance
 
 class Doctor
 {
	 int idnumber;
	 String name;
	 String address;
	 public Doctor(int idnumber, String name, String address) {
		this.idnumber = idnumber;
		this.name = name;
		this.address = address;
	}
	 void display() {
		    System.out.println("********* Doctor Details ***********");
		        System.out.println("The name is :" + name);
		        System.out.println("The number is :" + idnumber);
		        System.out.println("The address is :" + address);
		    }
 }
	 class Specalist extends Doctor
	 {
		   String speciality;

		public Specalist(int idnumber, String name, String address,String sp) {
			super(idnumber, name, address); //invokes base class constructor
			// TODO Auto-generated constructor stub
			this.speciality=sp;
		}
		void display() {
		    super.display(); // call base class method
		    System.out.println("The speciality is :" + speciality);
		    }
	 }
  class NonSpecialist extends Doctor
  {

public NonSpecialist(int idnumber, String name, String address) {
		super(idnumber, name, address);
		// TODO Auto-generated constructor stub
	}
  }

public class TestDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke child class  Specalist constructor
		Specalist spobj=new Specalist(1001,"tej","kadapa","cardiologist");
		spobj.display(); // invoke  child class specalist display () method
		
		NonSpecialist nspobj=new NonSpecialist(1005,"sai","los angels");
		nspobj.display();
	}

}
