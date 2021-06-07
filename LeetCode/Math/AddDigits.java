/* 

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 

Constraints:

0 <= num <= 231 - 1

*/

class Solution {
    public int addDigits(int num) {

        // count the digit 
        

            if (num <= 9){
                return num;
            }else{
                if( num % 9 == 0 ){
                    return 9;
                }
                else{
                    return num % 9;
                }
            
            }
                

            }

            
    }



class AddDigits{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1]

        int n = 18;
        
        int result  = obj.addDigits(n);

        System.out.print(result);
        
    }
}
