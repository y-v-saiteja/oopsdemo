package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,Double> hm= new  HashMap<String,Double>();
       
       
       hm.put("sai", 10000.50);
       hm.put("tej", 6000.50);
       hm.put("yvst", 2000.20);
       hm.put("mike", 4500.22);
       hm.put("sai teja", 7500.30);
       
       System.out.println("display customers & balance amount : ");
	    for(String k:hm.keySet())
	    {
	    	System.out.println(k+"--->"+hm.get(k));
	    }
	    
	    // deposit 1000 to yvst account
	    
	    double bal=hm.get("yvst");
	    hm.put("yvst",bal+1000);
	    System.out.println("yvst new balance:"+hm.get("yvst"));
	    
	    hm.putIfAbsent("raj", 15000.00);
	    System.out.println(hm);
	    
	    
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter customer name for his balance");
	    String name=s.next();
	    System.out.println("the balance of name"+name+"is"+hm.get(name));
	    
	}

}
