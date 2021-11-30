package oopsdemo3;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programming for interfaces not implementation
		
		
		Shape shape=new Circle(10);
		
		System.out.println("using interface:"+shape.LABLE);
		 
		shape.draw();
		System.out.println("area of circle is:"+shape.getArea());
		
		//switching from one implementation to another easily
		
		shape=new Rectangle(10,7);
		
		shape.draw();
		System.out.println("area of rectangle is:"+shape.getArea());
		
		

	}

}
