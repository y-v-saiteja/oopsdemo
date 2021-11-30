package oopsdemo3;

// rectangle class is implementing shape interface
public class Rectangle implements  Shape {
	
	private double height;
	private double width;
	

	

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}
	
	

}
