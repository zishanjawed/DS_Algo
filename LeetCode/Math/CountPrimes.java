/* 

Count the number of prime numbers less than a non-negative number, n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 106


*/
class Solution {
    public int countPrimes(int n) {
        int countPrime = 0;
        if(n < 2){
            return 0;
        }
        for (int i = 2; i <n; i++){
            boolean isPrime = true;
            for(int j = 2; j*j<=i; j++ ){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                // System.out.println(i);
                countPrime++;
            }
            
        }
        return countPrime;
        
    }
}


class CountPrimes{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1]

        int n = 2;
        
        int result  = obj.countPrimes(n);

        System.out.print(result);
        
    }
}
