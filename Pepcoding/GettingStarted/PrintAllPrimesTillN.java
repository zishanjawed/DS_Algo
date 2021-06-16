
/* 

1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
Input Format
low 
high
Output Format
n1
n2
.. all primes between low and high (both included)
Question Video


Constraints
2 <= low < high < 10 ^ 6
Sample Input
6 
24
Sample Output
7
11
13
17
19
23


*/

class Solution {
    public void IsPrimeTillN(int high, int low) {

        
        for (int i = low; i <= high; i++){
            
            int factor = 0;
            
            for ( int j = 2; j*j <= i; j++ ){
                
                if( i % j == 0 ){
                    factor++;
                    break;
                }
            }
            if (factor == 0){
                System.out.println(i);
            }
            
        }

            
    }

}

class PrintAllPrimesTillN{
    public static void main(String[] args) {
        Solution obj = new Solution();

       int high = 24;
       int low = 6;
        
        obj.IsPrimeTillN(high,low);
          
    }
}
