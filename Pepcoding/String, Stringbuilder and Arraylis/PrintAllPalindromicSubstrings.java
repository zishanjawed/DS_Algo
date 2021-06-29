/* 
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.
Input Format
A String
Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.
Question Video

  COMMENTConstraints
1 <= length of string <= 500
Sample Input
abcc
Sample Output
a
b
c
cc
c


*/


import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		//write your code here
		
		char[] str_array = str.toCharArray();
		

		for (int i=0; i<str.length();i++){  //n
		    
		    for (int j= i; j<str.length();j++){  // n
		        
		        String temp = str.substring(i,j+1); //n = 2N
		        checKifPalindrom(temp); // n
		        
		    }
		}
		
		
	}
	
	public static void  checKifPalindrom(String str){
	    
	    int i = 0;
	    int j = str.length()-1;
	    boolean isPalim = true;
	    
	    while(j>i){  // n 
	        
	        if(str.charAt(i) != str.charAt(j)){ // O(1)
	            isPalim = false;
	            break;
	        }
	        i++;
	        j--;
	        
	    }
	    if(isPalim){
	        System.out.println(str);
	    }
	    
	    
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}