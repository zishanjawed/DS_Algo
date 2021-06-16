/* 
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.
Input Format
A number n
Output Format
pat201
Question Video


Constraints
1 <= n <= 10
 Also, n is odd.
Sample Input
5
Sample Output
*				*	
*				*	
*		*		*	
*	*		*	*	
*				*	


*/
class Solution {
    public void printPattern(int n) {
      
       
        for (int i=1; i<=n;i++){
            
            for(int j=1; j<=n;j++){
                
                if(j==1 || j == n){
                    System.out.print("*\t");
                }
                else if(i+j == n+1 && i > n/2){
                    System.out.print("*\t");
                }
                else if(i==j && i > n/2){
                    System.out.print("*\t");
                }
                else{
                   System.out.print("\t"); 
                }
            }
            
            System.out.println();
        }
    }
}

class Pattern16{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

