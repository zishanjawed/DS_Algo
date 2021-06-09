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
    public boolean countPythagoreanTriplet(int a,int b,int c) {
       

        if (a > b && a > c){
            if (Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
                return true;
            }
        }
        else if(b > c){
            if (Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2)){
                return true;
            }
        }else{
            if (Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
                return true;
            } 
        }

        return false;
    }
}


class PythagoreanTriplet{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases[1,0,1,0,1,0,1]

        int a = 5;
        int b = 3;
        int c = 4;
        
        boolean result  = obj.countPythagoreanTriplet(a,b,c);

        System.out.print(result);
        
    }
}
