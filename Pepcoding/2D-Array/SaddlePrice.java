/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.
Question Video

  COMMENTConstraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
41

*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
    
        
         Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();

       
     
        
        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                arr[i][j] = scn.nextInt();
                
            }
        }
        
        printSaddlePoint(arr,n);
        
    }
    
    public static void printSaddlePoint(int[][] arr,int n){
        
        // for(int i =0 ; i<n;i++){
        //     // Find minimum element and it's col
        //     int min_element = arr[i][0];
        //     int colom = 0;
            
        //     for(int col =1; col<n; col++ ){
        //         if(arr[i][col]<min_element){
        //             min_element = arr[i][col];
        //             colom = col;
        //         }
                
        //     }
            
            
        //     // Verify
            
        //     boolean vc = true;
            
        //     for(int row =0; row<n;row++){
                
        //         if(arr[row][colom]>min_element){
        //             vc = false;
        //             break;
        //         }
        //     }
            
        //     if(vc){
        //         System.out.println(min_element);
        //         return;
        //     }
            
            
        // }
        
        
        // System.out.println("Invalid input");
        
        
        int saddel_point = -1;
        
        
        for(int i=0; i<n;i++){
            for(int j = 0; j< n;j++){
                
                int current_number = arr[i][j];
               
                int lg = arr[i][j];
                int sm = arr[i][j];
                
                for(int row=i;row<n;row++){
                    
                    if(arr[row][j]>current_number){
                        lg = arr[row][j];
                        break;
                    }
                        
                }
                for(int col=j;col<n;col++){
                    
                    if(arr[i][col] < current_number){
                      sm = arr[i][col];
                      break; 
                    }
                        
                }
                
                if(lg == current_number && sm == current_number){
                    saddel_point = current_number;
                    break;
                }
                
            }
        }
        
        if(saddel_point == -1){
            System.out.println("Invalid input");
        }else{
            System.out.println(saddel_point);
        }
        
        
    }

}