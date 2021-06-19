/* 
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..
All subsets
Question Video


Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3
Sample Input
3
10
20
30
Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	

*/

import java.io.*;
import java.util.*;

public class SubsetOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i]= scn.nextInt();
        }
        
        int len = arr.length;
        
        
        
        for (int i = 0; i < (int)Math.pow(2,len);i++){
            
            int bn = dTob(i);
            int p = (int)Math.pow(10,len-1);
            for(int j=0;j<len;j++){
                
               int cd = bn/p;
                  bn = bn%p;
                  
                  if(cd == 0){
                    System.out.print("-\t");  
                  }
                  else{
                     System.out.print(arr[j]+"\t"); 
                  }
                  p /=10;
              
             
              
              
              
                
            }
            System.out.println();
        
    }
    
    
    
    
    
 }

    public static int dTob(int n){
        
       int bn = 0;
       int p = 1;
        while(n != 0){
        
        int r = n%2;
        n /= 2;
        
        bn += r *p;
        p *=10;
        
            
        }
        
        return bn;
    }

}
