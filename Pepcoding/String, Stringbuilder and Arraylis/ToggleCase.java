/* 
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
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
PEPcodINg

*/

import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here 
        
        String result = "";
        for (int i=0; i< str.length();i++){
            char temp = str.charAt(i);
            
            if((int)temp >= 65 && (int)temp <= 90 ){
                temp += 32;
            }else if( (int)temp >= 97 && (int)temp <= 122 )
            {
                temp -= 32;
            }
            
            result += temp;
        }


		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}