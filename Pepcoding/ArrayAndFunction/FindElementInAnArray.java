/* 
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing index at which d is found in array a and -1 if not found
Question Video


Constraints
1 <= n <= 10^7
-10^9 <= n1, n2 
.. n elements <= 10^9
-10^9 <= d <= 10^9
Sample Input
6
15
30
40
4
11
9
40
Sample Output
2

*/
class Solution {
    public int getFindElementInAnArray(int[5] n,e) {
      
        int f = -1;
        for (int i= 0; i<n;i++){
        
            if(e == arr[i]){
                f = i;
                break;
            }
        }
        return f;
    }


}

class FindElementInAnArray{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i]= scn.nextInt();
        }
        int e = scn.nextInt();
       int result = obj.getFindElementInAnArray(arr,e);
       System.out.println(result);
        
        
    }
}

