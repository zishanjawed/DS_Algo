/* 

1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to multiply n1 and n2 and print the value.
Input Format
A base b
A number n1
A number n2
Output Format
A number of base b equal in value to n2 * n1.
Question Video


Constraints
2 <= b <= 10
0 <= n1 <= 10000
0 <= n2 <= 10000
Sample Input
5
1220
31
Sample Output
43320


*/
class Solution {
    public static int getMul(int n1, int n2, int b){
       
        int p = 1;
        int mul = 0;

        while(n2 != 0){
            int r = n2 %10;
            n2 /= 10;

            int m = getMulForSingDigit(n1,r,b);
            // System.out.println(" m :- "+m);
            int sum = AnyBaseSum(mul,m*p,b) ;
            
            mul =sum;
            // mul += m*p;
            

            p *= 10;

        }

        return mul;
    }
    public static int getMulForSingDigit(int n,int d,int b){

        int mul = 0;
        int p = 1;
        int carry = 0;
        while(n != 0 || carry>0){
            int r = n % 10;
            
            n /= 10;
            int s = r*d+carry;
            
            
                
            carry = s / b;
            
            s = s % b;

            mul += s * p;

            p *=10;

        }
        return mul;
    }
    public static int AnyBaseSum(int n1, int n2, int b){
       
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
     

class AnyBaseMultiplication{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n1 = 1220;
        int n2 = 31;
        int b = 5;
        
        
        int d = obj.getMul(n1, n2,b);
        System.out.println(d);    
        
        
    }
}

