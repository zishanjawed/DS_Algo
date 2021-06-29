/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.

Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number x
A number n
Output Format
x raised to the power n
Question Video

  COMMENTConstraints
1 <= x <= 10
0 <= n <= 9
Sample Input
2
5
Sample Output
32
*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
    
                int n = scn.nextInt();
    
    int ans = power(x,n);
    System.out.println(ans);

    }

    public static int power(int x, int n){
        
        if(n==0)
            return 1;
            
        int xpnb2 = power(x,n/2);
        int xn = xpnb2*xpnb2;
        
        if(n %2 == 1){
            xn = xn *x;
        }
        
        return xn;
    }

}