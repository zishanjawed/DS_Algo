/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
A number representing difference of two numbers (a2 - a1), represented by two arrays.
Question Video


Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
number reresented by a1 is smaller than number represented by a2
Sample Input
3
2
6
7
4
1
0
0
0
Sample Output
7
3
3
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i< n1; i++){
        arr1[i]= scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i< n2; i++){
        arr2[i]= scn.nextInt();
    }
    
    int max_size=arr2.length;
    
    // = (n1.length>n2.length)?n1.length:n2.length;
    
    // if(arr1.length>arr2.length){
    //   max_size= arr1.length;
    // }else{
    //   max_size= arr2.length; 
    // }
    
    int[] resultArray = new int[max_size];
    int borrow =0;
    int p2 = arr2.length-1;
    int p1 = arr1.length-1;
    // int p3 = max_size-1;
    
    for(int i=max_size-1; i>=0; i--){
        int a = 0;
        int b = 0;
        if ( p1 < arr1.length && p2 >=0 ){
             a = arr2[p2];
        }
        if (p2 < arr2.length && p1 >=0){
            b = arr1[p1];
        }
        
       
        int d=(a+borrow)-b;
        if(d<0){
           d+=10;
            borrow=-1;
        }else{
            borrow=0;
        }
      
        
        resultArray[i]= d;
   
        
        p1--;
        p2--;
      //  p3--;
        
    }
    
    int i =0;
   while(resultArray[i] == 0){
    i++;   
   }

     for (int j =i ; j< max_size; j++){
         System.out.println(resultArray[j]); 
    }
    
 }

}