/**
 * 
   Author  : JayaKrishna
   Date    : 06/11/2020
   Desc    : HashMapSoretd.
 *
 **/

import java.util.*;

public class HashMapSoretd {                                      //created class HashMapSoretd
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();      //object creation for HashMap
		hashMap.put(1, "JK");
		hashMap.put(2, "Akhil");
		hashMap.put(3, "Sasank");
		hashMap.put(4, "Kiran");
		List<String> sortedHashMap=new ArrayList<String>();
		sortedHashMap=getValues(hashMap);
		System.out.println(sortedHashMap);
		
		
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap)    //Method created getValues() with Argument (HashMap)
        {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {        //for each loop
			sortedHashMap.add(entry.getValue());                   
		}
		Collections.sort(sortedHashMap);                               //Collections API sorting
		
		return sortedHashMap;                                          // return type  List
	}

}