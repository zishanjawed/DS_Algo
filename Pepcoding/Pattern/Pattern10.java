/* 

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
Input Format
A number n
Output Format
pat101
Question Video


Constraints
1 <= n <= 100
 Also, n is odd.
Sample Input
5
Sample Output
		*	
	*		*	
*				*	
	*		*	
		*		

*/
class Solution {
    public void printPattern(int n) {
      
       
        int start = 1;
        int space = n/2;
        
        for (int i =1; i<=n;i++){
            
            for (int j=1; j<=space;j++){
                System.out.print("\t");
            }
            for (int k=1; k<=start;k++){
                if(k==1 || k ==start){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
                
                
            }
            System.out.println();
            if(i <= n/2){
                start +=2;
                space--;
            }else{
                space ++;
                start -=2;
                
            }
        }
        
    }
}


class Pattern10{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 20;        
       obj.printPattern(n);        
    }
}

