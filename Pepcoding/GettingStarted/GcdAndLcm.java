
/* 

1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
Input Format
"n" where n is any integer.
"K" where k is any integer.
Output Format
"r", the rotated number
Question Video


Constraints
1 <= n < 10^9
-10^9 < k < 10^9
Sample Input
562984
2
Sample Output
845629

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
