/* 

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 

Constraints:

-231 <= x <= 231 - 1

*/

class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        int currentDigit;
        
        while(x != 0){
            
            currentDigit = x % 10;
            x /= 10;
            
            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10  && currentDigit > 7 ) return 0;
            if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE/10 && currentDigit < -8 ) return 0;
            
            reverse = (reverse * 10) + currentDigit;
        }
        
        return reverse;
        
    }
}



class ReverseInteger{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1] 1534236469
 
        int n = 1534236469;
        
        int result  = obj.reverse(n);

        System.out.print(result);
        
    }
}
