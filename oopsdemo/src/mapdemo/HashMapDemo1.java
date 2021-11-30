package mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);
	    
	 // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    System.out.println("Value at index 3: " + languages.get(3));
	    
	    // return set of keys
	    
	    System.out.println("keys:"+languages.keySet());
	    
	    //return set of values
	    
	    System.out.println("values"+languages.values());
	    
	    // return set of key-value pairs
	    
	    System.out.println("key-value mappings"+languages.entrySet());
	    
	    languages.replace(2, "c++");
	    
	    //iterate tru keys---keyset()
	    
	    System.out.println("keys: ");
	    for(Integer k:languages.keySet())
	    {
	    	System.out.println(k+"--->"+languages.get(k));
	    }
	    
	    // iterate tru key-value pairs---entryset()
	    
	    System.out.println("entries:  ");
	    
	    for(Entry<Integer, String> entry:languages.entrySet())
	    {
	    	System.out.println(entry);
	    }
	}

}
