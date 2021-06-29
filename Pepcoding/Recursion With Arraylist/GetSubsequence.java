/**
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output
Question Video

  COMMENTConstraints
0 <= str.length <= 20
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]

*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        String str = scn.next();
        // ArrayList<String> ans =  ;
        System.out.println(gss(str));
        
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> base_ans = new ArrayList<>();
            base_ans.add("");
            return base_ans;
        }
            
        
        
        
        char ch = str.charAt(0);
        
        String rs = str.substring(1);
        
        ArrayList<String> temp_ans = gss(rs);
        
        ArrayList<String> ans = new ArrayList<>();
        // ans.append(temp_ans);
        
        for(int i=0; i<temp_ans.size();i++){
            ans.add(temp_ans.get(i));
        }
        
        
        int len = temp_ans.size();
        for(int i=0; i<len;i++){
            ans.add(ch+ans.get(i));
        }
        
        
        return ans;    
        
    }

}