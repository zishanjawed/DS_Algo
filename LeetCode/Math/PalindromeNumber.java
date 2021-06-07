/* 

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false
 

Constraints:

-231 <= x <= 231 - 1


*/

class Solution {
    public boolean isPalindrome(int n) {

        int temp = n;
        int pal = 0;
        int counter = 0;

        int c = n;

        while(c > 0){
            c /= 10;
            counter++;
        }

        while(temp > 0 ){
            // counter++;
            int digit = temp % 10;
            temp /= 10;
            if(counter > 1){
                pal += ((int)Math.pow(10,counter-1)*digit);
            }
            else{
                if (digit == 0)return false;
                pal += digit;
            }
            counter--;
        }
        if (pal == n)
        return true;
        else
        return false;
        
    }
}




class PalindromeNumber{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1]
 
        int n = 123;
        
        boolean result  = obj.isPalindrome(n);

        System.out.print(result);
        
    }
}
