
/* 

1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.
Input Format
"n" where n is any integer.
Output Format
"d" where d is the number of digits in the number "n"
Question Video


Constraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
8
*/

class Solution {
    public int countDigits(int n) {

        // count the digit 
        
        int digit = 0;
        while(n >0){
            
            n = n/10;
            digit++;
            
        }

        return digit;

            
    }

}

class CountDigitsInANumber{
    public static void main(String[] args) {
        Solution obj = new Solution();

  
       
       int n = 65784383;
       
       int result =  obj.countDigits(n);

       System.out.println(result);
       
    }
}
