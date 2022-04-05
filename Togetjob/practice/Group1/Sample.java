package Group1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Sample {
	public static void main(String[] args)
	 {
	HashMap<String,Integer>	map=new HashMap<>();
	map.put("hi",10);
	map.put("hello", 20);
	Set<String> set = map.keySet();
	ArrayList<String> list= new ArrayList<String>(set);
	Collection<Integer> value = map.values();
	ArrayList<Integer> List1=new ArrayList<Integer>(value);
	System.out.println("String values into list"+list);
	System.out.println("integer values into List"+List1);	
	}
	}

