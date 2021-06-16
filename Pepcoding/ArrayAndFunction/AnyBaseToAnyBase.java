/* 
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.
Input Format
A number n
A base b1
A base b2
Output Format
A number of base b2 equal in value to n of base b1.
Question Video


Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10
Sample Input
111001
2
3
Sample Output
2010

*/
class Solution {
    public static int getDecimalNumber(int n, int b){
       
        int ans = 0;
        int p= 1;
        
        while(n !=0){
            
            int r = n%10;
            n /=10;
            
            ans += (p * r);
            
            
            p  = p*b;
           
                  
                        
  
        }
        return ans;
     }
     public static int getAnyBase(int n, int b){
         
         int ans = 0;
          int power =1;
          
          while(n !=0){
              int r = n%b;
              n /= b;
              
              ans += (r*power);
              power *=10;
          
          }
         
         return ans;
          
     }
     
     
}


class DigitFrequency{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 111001;
        int sourceBase = 2;
        int destBase = 3;
        
        
        int dn = obj.getDecimalNumber(n,sourceBase);
        int val = obj.getAnyBase(dn,destBase);
        System.out.println(val);
        
        
    }
}

