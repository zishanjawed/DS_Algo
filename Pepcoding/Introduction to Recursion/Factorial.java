/*
1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
factorial of n
Question Video

  COMMENTConstraints
0 <= n <= 10
Sample Input
5

Sample Output
120

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
         int ans = factorial(n);
         System.out.println(ans);
    }

    public static int factorial(int n){
        
        if(n==1)
            return 1;
        
    return n*factorial(n-1);
    
    }

}