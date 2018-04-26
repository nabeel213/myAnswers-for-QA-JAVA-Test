package code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		
		int b = 1;
		String finalString = "";
		
		for (int i = 0; i <input.length(); i++) {
			
		String result = input.substring(i, b);
		finalString = finalString + result + result;
		
		b++;
		
		}
		return finalString;
	}
	
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		int length = input.length();

		if(length <= 10) return "";
		
		  String tmpString = "";
		  String finalString = "";
		  int startInt = 0;
		  int finishInt = 0;
		  boolean found = false;
		  
		  for (int i = 0; i < length - 4; i++) {
		    tmpString = input.substring(i, i+5);
		    
		    if (tmpString.equals("bread") && found == true)
		      finishInt = i;  
		      
		    if (tmpString.equals("bread") && found == false) {
		      startInt = i+5;
		      found = true; 
		    } 
		  }
		  
		  finalString = input.substring(startInt,finishInt);
		  return finalString;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
	
		int [] array = {a, b, c };
		
		Arrays.sort(array);
		
		return array[1] * 2 - array[0] == array[2];
	
		
		
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		
			String outputString = "";
			outputString += input.substring(0,a);
			outputString += input.substring(input.length()- a, input.length());
			
			return outputString;
	}
	
	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		
		boolean bool = false;
		int stringLength =  input.length();
		
		if(input.length() < 2) {
			bool = false;
			return bool;
		} else {
		
			String subString2 = input.substring(stringLength - 2, stringLength);
			
			if(subString2.contains("ly")){
			
				bool = true;
				return bool;
			}
			else {
				bool = false;
				return bool;
			}
		}
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		
		String result = "";
	    for (int i = 0; i < input.length(); i++) {
	    	
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	        	
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		
		 if(input == 0)
		        return 0;
		    else if(input == 1)
		      return 1;
		   else
		      return fibonacci(input - 1) + fibonacci(input - 2);
	}
		

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		
		if(input == 0) {
			
			return 0;
		}
			return 2+bunnyEars(input-1);
		}

}
