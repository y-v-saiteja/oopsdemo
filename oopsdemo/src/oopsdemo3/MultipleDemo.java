package oopsdemo3;

//implement multiple inheritance

class Result extends Candidate implements Exam
{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void percent_cal() {
		int total=(mark1+mark2);
        float percent=total*100/200;
        System.out.println ("Percentage: "+percent+"%");
		
	}
	
	void display()
    {
        super.display();
    }
	
	
}

public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result r1=new Result("john",101,92,85);
		r1.display();
		r1.percent_cal();
		
		

	}

}
