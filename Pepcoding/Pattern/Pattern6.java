/* 
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
Input Format
A number n
Output Format
pat61
Question Video


Constraints
1 <= n <= 100
 Also, n is odd.
Sample Input
5
Sample Output
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

*/
class Solution {
    public void printPattern1(int n) {
      
       
        int start = n/2+1;
        int space = 1;
        
        for (int i =1; i<=n;i++){
            
            for (int k=1; k<=start;k++){
                System.out.print("*\t");
            }
            
            
            for (int j=1; j<=space;j++){
                System.out.print("\t");
            }
            
            for (int k=1; k<=start;k++){
                System.out.print("*\t");
            }
            
            System.out.println();
            if(i <= n/2){
                start --;
                space+=2;
            }else{
                space -=2;
                start ++;
                
            }
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

