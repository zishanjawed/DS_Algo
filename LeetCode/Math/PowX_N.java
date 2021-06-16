/* 

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
-104 <= xn <= 104


*/

class Solution {
    public double myPow(double x, int n) {
        
        double result = 1;
        
        if (x > 0 && n > 0){
            for (int i = 1; i <= n; i++){
            result *= x;
            }
        }
        else if(x < 0 && n < 0)
        {
            for (int i = -1; i >= n; i--){
            result /= x;
            }
            
        }
        else if(x < 0 && n < 0)
        {
            for (int i = -1; i >= n; i--){
            result /= x;
            }
            
        }
        else if(x < 0 && n > 0)
        {
            for (int i = 1; i <= n; i++){
            result *= x;
            }
            

        }
        else if(x > 0 && n < 0)
        {
            for (int i = -1; i >= n; i--){
                result /= x;
            }
            

        }
        
        
        return result;
    }
}



class PowX_N{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1] 1534236469
 
        double x = 2.00000;
        int n = -2;
        
        double result  = obj.myPow(x,n);

        System.out.print(result);
        
    }
}
