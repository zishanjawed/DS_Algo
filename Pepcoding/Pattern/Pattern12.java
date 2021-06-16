/* 
1. You are given a number n.
2. You've to create a pattern as shown in output format.
Input Format
A number n
Output Format
pat121
Question Video


Constraints
1 <= n <= 5
Sample Input
5
Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	

*/
class Solution {
    public void printPattern(int n) {
      
       
        int number1 = 0;
       int number2 = 1;
            
        for (int i = 1; i<=n; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(number1+"\t");
                int number3 = number1 + number2;
                
                number2 = number1;
                number1 = number3;
            }
            System.out.println();
            
            
            
           
            
        }

        
    }
}


class Pattern7{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

