
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
    public void printGcdAndLcm(int n1, int n2) {
        
        // Find GCD 
        
        int num1 = n1;
        int num2 = n2;

        while(num2%num1 !=0){
            int r = num2%num1;
            num2 = num1;
            num1 = r;
        }

        int GCD = num1;

        // LCM = n1 * n2 / GCD

        int LCM = (n1 * n2) / GCD;

        System.out.println(GCD);
        System.out.println(LCM);

    }
}


class GcdAndLcm{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        

        int n1 = 36;
        int n2 = 24;
        
        obj.printGcdAndLcm(n1,n2);

        
        
    }
}
