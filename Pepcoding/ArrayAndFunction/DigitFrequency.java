/* 
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
Input Format
A number n
A digit d
Output Format
A number representing frequency of digit d in number n
Question Video


Constraints
0 <= n <= 10^9
0 <= d <= 9
  
Sample Input
994543234
 4
Sample Output
3

*/
class Solution {
    public int getDigitFrequency(int n,int d) {
      
       
        int f = 0;
        
        while(n !=0){
            int c = n%10;
            n /=10;
            
            if (d == c){
                f++;
            }
        }
        return f;
    }
}

class DigitFrequency{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 994543234;
        int d = 4;
        
        
       int result = obj.getDigitFrequency(n,d);
       System.out.println(result);
        
        
    }
}

