/* 
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.
Input Format
A number n
A base b
Output Format
A number representing corresponding value of n in number system of base b
Question Video


Constraints
0 <= d <= 512
2 <= b <= 10
  
Sample Input
57
 2
Sample Output
111001

*/
class Solution {
    public int convertDesimalToBase(int n,int b) {
      
       
        int ans = 0;
        int power =1;
        
        while(n !=0){
            int r = n%b;
            n /= b;
            
            ans += (r*power);
            power *=10;
        
        }
       
       return ans;
    }
}

class DigitFrequency{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 57;
        int b = 2;
        
        
       int result = obj.convertDesimalToBase(n,b);
       System.out.println(result);
        
        
    }
}

