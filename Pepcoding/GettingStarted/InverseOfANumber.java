/* 

1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.
Input Format
a, an integer
b, an integer
c, an integer
Output Format
true if the numbers form a pythagorean triplet and false otherwise
Constraints
1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9
Sample Input
5 3 4
Sample Output
true


*/
class Solution {
    public int getInverseOfANumber(int n) {
       
        int digit_counter = 0;
        int reverse_number = 0;
        int div = n;

        while(div > 0){
            digit_counter++;
            int current_digit = div % 10;
            div /= 10;
            if (current_digit > 1){
                reverse_number += (int)(Math.pow(10,current_digit - 1) * digit_counter);
            }
            else{
                reverse_number += digit_counter;
            }
            
        }
        return reverse_number;
        
    }
}


class InverseOfANumber{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1]

        int n = 2134;
        
        
        int result  = obj.getInverseOfANumber(n);

        System.out.print(result);
        
    }
}
