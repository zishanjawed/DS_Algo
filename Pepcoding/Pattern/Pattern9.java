/* 

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
Input Format
A number n
Output Format
pat91
Question Video


Constraints
1 <= n <= 100
 Also, n is odd.
Sample Input
5
Sample Output
*				*	
	*		*		
		*			
	*		*		
*				*	

*/
class Solution {
    public void printPattern(int n) {
      
       
        for (int i=1; i<=n; i++){
            
            for (int j=1; j<=n; j++){
                
                if(i + j == n +1){
                    System.out.print("*\t");
                }
                else if (i == j){
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


class Pattern9{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 20;        
       obj.printPattern(n);        
    }
}

