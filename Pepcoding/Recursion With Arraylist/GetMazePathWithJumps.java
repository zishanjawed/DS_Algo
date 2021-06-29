/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
A number m
Output Format
Contents of the arraylist containing paths as shown in sample output
Question Video

  COMMENTConstraints
0 <= n <= 10
0 <= m <= 10
Sample Input
2
2
Sample Output
[h1v1, v1h1, d1]
*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(1,1,n,m));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
      
      
      if(dr ==sr && dc==sc){
            ArrayList<String> bans = new  ArrayList<>();
            bans.add("");
            return bans;
        }
      
      ArrayList<String> ans = new  ArrayList<>();
      
      for(int i=1;i<=dc-sc;i++){
      
          ArrayList<String> rrh = new  ArrayList<>();
          
          rrh = getMazePaths(sr,sc+i,dr,dc);
          
          for(String str : rrh){
              ans.add("h" + i + str);
          }
      
          
      }
      
      for(int i=1;i<=dr-sr;i++){
        
            ArrayList<String> rrv = new  ArrayList<>();
        
            rrv = getMazePaths(sr+i,sc,dr,dc); 
          
          for(String str : rrv){
              ans.add("v" + i + str);
          }
      
          
      }
      
      for(int i=1;i<=dr-sr && i<=dc-sc;i++){
       
          ArrayList<String> rrd = new  ArrayList<>();
          
          rrd = getMazePaths(sr+i,sc+i,dr,dc);    
          
          for(String str : rrd){
              ans.add("d" + i + str);
          }
          
          
      }
      
      
      
      return ans;
      
    }

}