/*
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r
Output Format
output is handled by display function
Question Video

  COMMENTConstraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9
Sample Input
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3
Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57


*/


import java.io.*;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        } 
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        shellRotate(arr,s,r);
        display(arr);
        
           
    }
    
    public static void shellRotate(int[][] arr, int s, int r){
        
        int [] la = fill1Dfrom2D(arr,s);
        rotate1D(la,r);
        fill2Dfrom1D(arr,s,la);
        
        
    }
    
    public static int[] fill1Dfrom2D(int[][] arr, int s){
        
        
        
        int rmin = s-1;
        int cmin = s-1;
        int rmax = (arr.length -1) - (s-1);
        int cmax = arr[0].length -1 - (s-1);
        
        // int noe = 2*(rmax-rmin) + 2*(cmax-cmin);
        int count = 0;
        int[]  singleD = new int[2*(rmax-rmin) + 2*(cmax-cmin)];
        
        // while(count < noe){
            
            // left boundary
            
            for(int row = rmin; row <= rmax ; row++){
                // System.out.println(arr[row][cmin]);
                singleD[count] = arr[row][cmin];
                count++;
            }
            cmin++;
            
            // bottom boundary
            
            for(int col = cmin; col <= cmax ; col++){
                //  System.out.println(arr[rmax][col]);
                 singleD[count] = arr[rmax][col];
                count++;
            }
            rmax--;
            
            // right boundary
            
            for(int row=rmax; row >= rmin ; row--){
                // System.out.println(arr[row][cmax]);
                singleD[count] = arr[row][cmax];
                count++;
            }
            cmax--;
            
            // top boundary
            
            for(int col = cmax; col >= cmin;col--){
                // System.out.println(arr[rmin][col]);
                singleD[count] = arr[rmin][col];
                count++;
            }
            rmin++;
            
            
        // }
        
        return singleD;
        
        
    }
    
    
    public static void rotate1D(int[] a, int k){
   
    int len = a.length;
    int reverse_at = k % len;
    if(reverse_at < 0){
        reverse_at +=len;
    }
    
    reverseArray(a,0,len-1);
    reverseArray(a,0,reverse_at-1);
    reverseArray(a,reverse_at,len-1);
   
    
   }
  
    public static void reverseArray(int[] a, int left,int right){
         while(left  <= right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            
            left++;
            right--;
        } 
    }
    
    public static void fill2Dfrom1D(int[][] arr, int s, int[] singleD){
        int rmin = s-1;
        int cmin = s-1;
        int rmax = (arr.length -1) - (s-1);
        int cmax = arr[0].length -1 - (s-1);
        
        // int noe = 2*(rmax-rmin) + 2*(cmax-cmin)-4;
        int count = 0;
        // while(count < noe){
            
            // left boundary
            
            for(int row = rmin; row <= rmax ; row++){
                // System.out.println(arr[row][cmin]);
                arr[row][cmin] = singleD[count];
                count++;
            }
            cmin++;
            
            // bottom boundary
            
            for(int col = cmin; col <= cmax ; col++){
                //  System.out.println(arr[rmax][col]);
                  arr[rmax][col]=singleD[count] ;
                count++;
            }
            rmax--;
            
            // right boundary
            
            for(int row=rmax; row >= rmin ; row--){
                // System.out.println(arr[row][cmax]);
                arr[row][cmax]=singleD[count] ;
                count++;
            }
            cmax--;
            
            // top boundary
            
            for(int col = cmax; col >= cmin ;col--){
                // System.out.println(arr[rmin][col]);
                 arr[rmin][col]=singleD[count] ;
                count++;
            }
            rmin++;
            
            
        // }
    }
    
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}