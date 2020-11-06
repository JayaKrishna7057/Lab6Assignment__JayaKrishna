/**
 * 
   Author  : JayaKrishna
   Date    : 06/11/2020
   Desc    : SecondSmallest
 *
 **/

import java.util.*;

public class SecondSmallest {                         //created class SecondSmallest
	public static void main(String[] args) {
		Integer numArray[]= {25,55,13,77,9,75};        //assigning integers to the array
		int secondSmallestElement=getSecondSmallest(numArray);
		System.out.println("Second Smallest element is : "+secondSmallestElement);
	}

	private static int getSecondSmallest(Integer[] numArray) {     //Method created  getSecondSmallest with Argument (int)
		List<Integer> element=Arrays.asList(numArray);
		Collections.sort(element);                             //Collection ApI sorting
		System.out.println("Sorting Array\n"+element);
		Integer secondSmallest=element.get(1);
		return secondSmallest;                                 //return type int
	}

}