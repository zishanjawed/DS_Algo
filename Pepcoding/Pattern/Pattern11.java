/* 

1. You are given a number n.
2. You've to create a pattern as shown in output format.
Input Format
A number n
Output Format
pat111
Question Video


Constraints
1 <= n <= 44
Sample Input
5
Sample Output
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15

*/
class Solution {
    public void printPattern(int n) {
      
       
        int counter = 1;
        int number = 1;
        
        for (int i=1; i <= n; i++){
            
            for (int j = 1; j<=i; j++){
                System.out.print(counter+"\t");
                counter++;
            }
            System.out.println();
            
            number++;
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

