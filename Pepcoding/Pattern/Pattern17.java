/* 
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.
Input Format
A number n
Output Format
pat171
Question Video


Constraints
1 <= n <= 10
 Also, n is odd.
Sample Input
5
Sample Output
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	


*/
class Solution {
    public void printPattern(int n) {
      
       
        int star = 1;
        int space = n/2;
        
        for (int i=1; i<=n; i++){
            
            for(int j=1; j<=space;j++){
                if(i == n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                } 
            }
            for(int k = 1; k<=star;k++){
                System.out.print("*\t");
            }
            
            if(i > n/2){
                star--;
            }else{
                star++;
            }
            
            System.out.println();
        }
}


class Pattern16{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

