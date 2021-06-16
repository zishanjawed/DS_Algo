
/* 

1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.
Input Format
num1
num2
.. the numbers whose GCD and LCM we have to find.
Output Format
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.
Question Video


Constraints
2 <= n <= 10^9
Sample Input
36
24
Sample Output
12
72

*/
class Solution {
    public void printPrimeFactorisationOfANumber(int n) {
        
        for (int counter = 2; counter*counter <= n; counter++){
            if (n % counter == 0){
                System.out.print(counter+" ");
                n /= counter;
            }
            
        }
        
        if (n != 1){
            System.out.print(n);
        }
        
       
    }
}


class PrimeFactorisationOfANumber{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 1440;
        obj.printPrimeFactorisationOfANumber(n);

        
        
    }
}
