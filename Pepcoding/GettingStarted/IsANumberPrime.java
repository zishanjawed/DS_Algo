
/* 

1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
Input Format
A number t
A number n
A number n
.. t number of times
Output Format
prime
not prime
not prime
.. t number of times
Constraints
1 <= t <= 10000
2 <= n < 10^9
Sample Input
5
13
2
3
4
5
Sample Output
prime
prime
prime
not prime
prime
*/

class Solution {
    public void IsPrime(int n) {

        // count the digit 
        
        int factor = 0;
        for (int j =2 ; j*j <= n; j++){
            if (n%j == 0){
                factor++;
                break;
                
            }
        }
        if (factor > 0){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }

            
    }

}

class IsANumberPrime{
    public static void main(String[] args) {
        Solution obj = new Solution();

  
       
       int nums[] =   {13,2,3,4,5};
       
       for (int i = 0; i < 5; i++){
        
        obj.IsPrime(nums[i]);
       }    
    }
}
