/* 

1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.
Input Format
A base b
A number n1
A number n2
Output Format
A number representing the sum of n1 and n2 in base b.
Question Video


Constraints
2 <= b <= 10
0 <= n1 <= 256
0 <= n2 <= 256
Sample Input
8
777
1
Sample Output
1000


*/
class Solution {
    public static int getSum(int n1, int n2, int b){
       
        int p = 1;
        int sum = 0;
        int c = 0;
        
        while(n1!=0||n2!=0){
            int r1= n1%10;
            n1 /=10;
            int r2=n2%10;
            n2 /=10;
            
            
            int s = r1 + r2 +c;
            c = s/b;
           int r=s%b;
           sum+=r*p;
            
            p *=10;
            
            
        }
        if(c!=0) sum+=c*p;
        return sum;
    }
}
     

class DigitFrequency{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n1 = 8;
        int n2 = 777;
        int b = 8;
        
        
        int d = getSum(n1, n2,b);
        System.out.println(d);    
        
        
    }
}

