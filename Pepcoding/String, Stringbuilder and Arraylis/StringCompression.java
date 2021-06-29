/* 
1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
Input Format
A String
Output Format
Two strings representing first compressed string and second compressed string respectively.
Question Video

  COMMENTConstraints
1 <= length of string <= 1000
Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6

*/


import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		char temp = str.charAt(0);
		String result = ""+temp;
		for(int i=1; i<str.length();i++){
		    
		    if (temp != str.charAt(i)){
		        temp = str.charAt(i);
		        result += str.charAt(i);
		    }
		}
		
		

		return result;
	}

	public static String compression2(String str){
	    
    	    char temp = str.charAt(0);
    	    int counter = 1;
    		String result = ""+temp;
    		for(int i=1; i<str.length();i++){
    		    
    		    char currentChar = str.charAt(i);
    		    
    		    if (temp != currentChar){
    		        temp = str.charAt(i);
    		         
    		        if(counter != 1){
    		            result = result+""+counter; 
    		        }
    		        result += ""+temp;
    		        counter = 1;
    		    }else{
    		        counter++;
    		    }
    		}
		
		if(counter != 1){
		    result = result+""+counter;
		}
        
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}