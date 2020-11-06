/**
 * 
   Author  : JayaKrishna
   Date    : 06/11/2020
   Desc    : SquareNumber
 *
 **/

import java.util.*;

public class SquareNumber {                          //created class SquareNumber
	public static void main(String[] args) {
		int sqNum[]= {7,5,9,2,3,6};          //assigning integers to the array
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {      //Method created getSquares with Argument (int)
		
		Map<Integer,Integer> squareMap=new HashMap<>();             //object creation with hashmap
		for(int square:sqNum) {                                     //for each loop
			squareMap.put(square,square*square);
		}
		return squareMap;                                           //return type hashmap
	}

}