/* 
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min
Question Video


Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9
Sample Input
6
15
30
40
4
11
9
Sample Output
36

*/
class Solution {
    public int getSpanOfArray(int[5] n) {
      
       
        int d = 0;
    
        for (int i= 0; i<n;i++){
            
            for(int j= 0; j<n;j++){
                if (arr[j]-arr[i]>d) d= arr[j]-arr[i];
            }
        }
      return d;
    }
}

class SpanOfArray{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i]= scn.nextInt();
        }
        
       int result = obj.getSpanOfArray(arr);
       System.out.println(result);
        
        
    }
}

