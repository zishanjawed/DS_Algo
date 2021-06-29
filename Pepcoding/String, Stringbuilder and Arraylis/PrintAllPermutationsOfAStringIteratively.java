/* 
    1. You are given a string. 
2. You have to print all permutations of the given string iteratively.
Input Format
A String
Output Format
All permutations of the given string(one in a line). 
Question Video

  COMMENTConstraints
1 <= length of string <= 15
Sample Input
abc
Sample Output
abc
bac
cab
acb
bca
cba

*/

import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		
		int n = str.length();
		int f = factorial(n);
		
		for (int i = 0; i < f; i++){
		    StringBuilder sb = new StringBuilder(str);
		    int temp = i;
		    
		    for(int div = n; div >= 1; div--){
		        int q = temp/div;
		        int r = temp%div;
		        
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp = q;
		    }
		    System.out.println();
		}
		
		
		
		
		
		
	}
	
	public static int factorial(int n){
	    
	    if (n == 1)
	        return 1;
	    
	    return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}