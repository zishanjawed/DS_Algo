
/* 

1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               
Input Format
n, an integer
Output Format
p1  p2  p3  p4.. all prime factors of n
Question Video


Constraints
2 <= n < 10 ^ 9
Sample Input
1440
Sample Output
2 2 2 2 2 3 3 5
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
