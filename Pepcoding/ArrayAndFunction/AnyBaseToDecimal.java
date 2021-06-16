/* 
1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.
Input Format
A number n
A base b
Output Format
A decimal number representing corresponding value of n in base b.
Question Video


Constraints
0 <= d <= 1000000000
2 <= b <= 10
  
Sample Input
111001
2
Sample Output
57

*/
class Solution {
    public int getValueIndecimal(int n,int b) {
      
       
        int ans = 0;
      int p= 1;
      
      while(n !=0){
          //System.out.println(n + " ," + p);
          int r = n%10;
          n /=10;
          
          ans += (p * r);
          
          
          p  = p*b;
         
                
                      

      }
      return ans;
    }
}

class DigitFrequency{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 111001;
        int b = 2;
        
        
       int result = obj.getValueIndecimal(n,b);
       System.out.println(result);
        
        
    }
}

