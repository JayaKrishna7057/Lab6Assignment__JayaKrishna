/**
 * 
   Author  : JayaKrishna
   Date    : 06/11/2020
   Desc    : SortReverseNumber.
 *
 **/

import java.util.*;

public class SortReverseNumber {                   //created class SortReverseNumber
	public static void main(String[] args) {
		
		List<Integer> result=new ArrayList<>(Arrays.asList(68,55,22,11,66));  //To read all elements Arrays.asList()
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array\n "+reverse);
	}
	
	private static List<Integer> getSorted(List<Integer> result) {             //method getSorted with argument (int)
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		Collections.reverse(reverseSorted);                                //Collections API sorting                                 
		 for(int i=0;i>result.size();i++) {                                //for loop
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array\n "+reverseSorted);
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;                                    //return type int
	}

	
	

}