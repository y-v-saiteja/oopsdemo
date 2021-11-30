package oopsdemo2;

//Dynamic polymorphism

public class TestVehicle {

	public static void main(String[] args) {
    Vehicle vobj=new Vehicle();
    vobj.drive();
    
    Vehicle vcar=new Car();     //upcasting
    vcar.drive();
    
    Vehicle vtruck=new Truck();
    vtruck.drive();
    
    

	}

}
