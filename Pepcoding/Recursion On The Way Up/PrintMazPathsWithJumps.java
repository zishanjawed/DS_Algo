/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
A number m
Output Format
Print paths (one path in each line) in order hinted by Sample output
Question Video

  COMMENTConstraints
0 <= n <= 5
0 <= m <= 5
Sample Input
3
3
Sample Output
h1h1v1v1
h1h1v2
h1v1h1v1
h1v1v1h1
h1v1d1
h1v2h1
h1d1v1
h2v1v1
h2v2
v1h1h1v1
v1h1v1h1
v1h1d1
v1h2v1
v1v1h1h1
v1v1h2
v1d1h1
v2h1h1
v2h2
d1h1v1
d1v1h1
d1d1
d2

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int m = scn.nextInt();
    
    printMazePaths(0,0,n-1,m-1,"");
    
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String asf) {
        
        if(sr==dr && sc == dc){
            System.out.println(asf);
            return;
        }
        
        
        for(int jump =1; jump <= dc - sc;jump++){
            
            printMazePaths(sr,sc+jump,dr,dc,asf+"h"+jump);
            
        }
        
        
        for(int jump =1; jump <= dr - sr;jump++){
            
            printMazePaths(sr+jump,sc,dr,dc,asf+"v"+jump);
            
        }
        
        
        for(int jump =1; jump <= dr - sr && jump <= dc-sc ;jump++){
            
            printMazePaths(sr+jump,sc+jump,dr,dc,asf+"d"+jump);
            
        }
        
        
    }

}