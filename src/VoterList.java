/**
 * 
   Author  : JayaKrishna
   Date    : 06/11/2020
   Desc    : VoterList
 *
 **/

import java.util.*;

public class VoterList {                             // //created class VoterList
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();  //object creation for HashMap 
		voterList.put(101, 44);
		voterList.put(102, 12);
		voterList.put(103, 30);
		voterList.put(104, 22);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {    //Method created voterList() with Argument (HashMap)
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {           //used for loop
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;                   //return type List
	}

}