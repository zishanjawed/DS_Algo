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
    public int rotateNumber(int n, int k) {
        
        // find lenght of n
        int len = 0;
        int temp = n;
        while(temp != 0){
            temp /=10;
            len++;
        }
       
        int rotate_at = k % len;

        int div = (int)Math.pow(10,rotate_at);

        int q = n / div;
        int r = n % div;
        
        int mul = (int)Math.pow(10,len-rotate_at);

        int ans = mul * r + q;




        return ans;
        // get actual rotating point  3%6 =3 , 12%6 =  0 
        
        
        
    }
}


class RotateANumber{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1]

        int n = 562984;
        int k = 2;
        
        int result  = obj.rotateNumber(n,k);

        System.out.print(result);
        
    }
}
