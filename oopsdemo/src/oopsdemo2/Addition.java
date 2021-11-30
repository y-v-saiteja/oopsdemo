package oopsdemo2;

public class Addition {
       
	 void add()
	 {
		 System.out.println("method overloading demo");
	 }
	 
	 void add(int a,int b)
	 {
		 System.out.println("the addition of two numbers is :"+(a+b));
	 }
	 void add(float a,float b)
	 {
		 System.out.println("the addition of two float numbers is :"+(a+b));
	 } 
	 void add(int a,int b,int c)
	 {
		 System.out.println("the addition of three numbers is :"+(a+b+c));
	 }
	 void add(String s1,String s2)
	 {
		 System.out.println("the addition of two strings is :"+(s1+s2));
	 }
}
