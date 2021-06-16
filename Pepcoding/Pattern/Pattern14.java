/* 
1. You are given a number n.
2. You've to create a pattern as shown in output format
                                 
                                
                               
Input Format
A number n
Output Format
pat131
Question Video


Constraints
1 <= n <= 10
Sample Input
5
Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	

*/
class Solution {
    public void printPattern(int n) {
      
       
        for (int i = 0; i<n; i++){
            
            int val = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(val+"\t");
                val = (val * (i - j))/(j+1);
                
            }
            System.out.println();
            
            
            
        }

        
    }
}


class Pattern14{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

