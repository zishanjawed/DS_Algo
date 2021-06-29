/* 
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
Input Format
A String
Output Format
A String
Question Video

  COMMENTConstraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
p-11e11p-45C12O-11D37i5n-39G
*/


import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		
		StringBuilder result = new StringBuilder();
		
		
		for(int i=0; i<str.length()-1;i++){
		 
		   result.append(str.charAt(i));
		 
		   result.append(str.charAt(i+1)-str.charAt(i));
		  
		   
		}
		result.append(str.charAt(str.length()-1));

		return result.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}