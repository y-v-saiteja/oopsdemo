package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		//add elements to hash map
		
		hmap.put(12,"tej");
		hmap.put(32,"sai");
		hmap.put(54,"yvst");
		hmap.put(24,"sai teja");
		hmap.put(15,"mike");

		
		// Display content using Iterator
        Set s=hmap.entrySet(); // return values from hmap
        Set s1=hmap.keySet();
        System.out.println(s);
       
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry mentry=(Map.Entry) itr.next();
            System.out.println(mentry.getKey()+"-->"+mentry.getValue());
        }
       
        System.out.println("*******************Key set**********");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer) itr1.next();
            String value=hmap.get(key);
            System.out.println(key+"---->"+value);
        }
        
        // get values based on key values
        String name=hmap.get(24);
        System.out.println("the name with key 24 is:"+name);
        
        //remove values based on key value
        hmap.remove(15);
        System.out.println(hmap);
        
 
	}
}
