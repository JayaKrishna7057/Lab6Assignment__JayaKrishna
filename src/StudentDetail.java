/**
 * 
   Author  : JayaKrishna
   Date    : 06/11/2020
   Desc    : StudentDetail
 *
 **/

import java.util.*;

public class StudentDetail {                         //created class StudentDetail
	public static void main(String[] args) {
		Map<Integer,Integer> student=new HashMap<>();      //object creation for HashMap
		student.put(101, 65);
		student.put(102, 96);
		student.put(103, 76);
		Map<Integer,String> medalDetails=getStudents(student);
		System.out.println(medalDetails);
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {       //Method created getStudents() with Argument (HashMap)
		Map<Integer,String> medalDetails=new HashMap<>();
		for(Map.Entry<Integer, Integer> entry:student.entrySet()) {                    //used for loop
			if(entry.getValue()>90) {
				medalDetails.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>80 && entry.getValue()<90) {
				medalDetails.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>70 && entry.getValue()<80) {
				medalDetails.put(entry.getKey(),"Bronze");
			}
			
		}
		return medalDetails;                      //return type HashMap
	}

}