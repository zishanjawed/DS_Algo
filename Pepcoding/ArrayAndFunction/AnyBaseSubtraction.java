/* 

1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to subtract n1 from n2 and print the value.
Input Format
A base b
A number n1
A number n2
Output Format
A number of base b equal in value to n2 - n1.
Question Video


Constraints
2 <= b <= 10
0 <= n1 <= 256
n1 <= n2 <= 256
Sample Input
8
1
100
Sample Output
77



*/
class Solution {
    public static int getSub(int n1, int n2, int b){
       
        int p = 1;
        int borrow = 0;
        int sub = 0;

        while(n1 != 0 || n2 != 0){
            int r2 = n2 % 10;
            int r1 = n1 % 10;

            n2 /= 10;
            n1 /= 10;

            int s = (r2 - borrow)-r1;
            if(s <0){
                s +=b;
                borrow = 1;
            }else{
                borrow = 0;
            }

            sub += s * p;

            p *=10;

        }
        return sub;
    }
}
     

class AnyBaseSubtraction{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n1 = 203;
        int n2 = 221;
        int b = 4;
        
        
        int d = obj.getSub(n1, n2,b);
        System.out.println(d);    
        
        
    }
}

