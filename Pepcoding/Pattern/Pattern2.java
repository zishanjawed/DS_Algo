/* 

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
Input Format
A number n
Output Format
pat21
Question Video


Constraints
1 <= n <= 100
Sample Input
5
Sample Output
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*


*/
class Solution {
    public void printPattern1(int n) {
      
        for (int i = 1; i <= n; i++){
            
            for(int j = n; j>=i; j--){
                System.out.print("*\t");
            }
            
            System.out.println();
        } 
        
    }
}


class Pattern1{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern1(n);

        
        
    }
}
