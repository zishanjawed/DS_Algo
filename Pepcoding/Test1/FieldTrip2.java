/*

School students of different class(classes 1-9) are going on a field trip. Event coordinator ,Miss. Pepper wants to make (multiple groups) groups of students among each other ,such that all students within a particular group must belong to the same class and all groups should have same number of students.
Miss. Pepper doesn't want any to be left alone in the group.
Will Miss. Pepper be able to make groups with such given constraints ?(true/false)
Input Format

integer n , representing number of students
c1 c2 c3 .ci.. cn ,representing class number of the ith student 
Constraints

n > 0 
1 <= ci <= 9
Output Format

print "true" is Miss. Pepper is able to make groups otherwise "false"
Sample Input 0

8
1 2 3 4 4 3 2 1
Sample Output 0

true
Explanation 0

valid groups [1,1],[2,2],[3,3],[4,4].
*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        boolean is_valid = true;
                
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        
        if(n%2==1){
            System.out.println("false");
            return;
        }
        int[] group_size = new int[9];
        for(int i=0;i<n;i++){
            group_size[arr[i]-1] +=   1;
        }
        
        
        
        int size = 0;
        for(int i=0; i<9;i++){
            if(group_size[i]!=0){
                if(size == 0)
                    size = group_size[i];
                else{
                    if(group_size[i] != size){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        
        System.out.println("true");
        
        
    }
}