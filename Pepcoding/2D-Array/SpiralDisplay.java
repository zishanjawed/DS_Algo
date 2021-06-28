/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..
Question Video

  COMMENTConstraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9
Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24


*/
import java.io.*;
import java.util.*;

public class SpiralDisplay{

    public static void main(String[] args) throws Exception {
        // write your code here
        
        
      Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        } 
        
        printSpiral(arr);

    }
    
    public static void printSpiral(int[][] arr){
        
        int rmin = 0;
        int cmin = 0;
        int rmax = arr.length -1;
        int cmax = arr[0].length -1;
        
        int noe = arr.length * arr[0].length;
        int count = 0;
        while(count < noe){
            
            // left boundary
            
            for(int row = rmin; row <= rmax && count < noe; row++){
                System.out.println(arr[row][cmin]);
                count++;
            }
            cmin++;
            
            // bottom boundary
            
            for(int col = cmin; col <= cmax && count < noe; col++){
                 System.out.println(arr[rmax][col]);
                count++;
            }
            rmax--;
            
            // right boundary
            
            for(int row=rmax; row >= rmin && count < noe; row--){
                System.oWut.println(arr[row][cmax]);
                count++;
            }
            cmax--;
            
            // top boundary
            
            for(int col = cmax; col >= cmin && count < noe;col--){
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;
            
            
        }
        
        
        
    }

}


