
/* 
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video


Constraints
0 <= n < 10^4
-10^9 <= a[i], k <= 10^9
Sample Input
5
1
2
3
4
5
3
Sample Output
3 4 5 1 2
*/
import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int len = a.length;
    int reverse_at = k % len;
    if(reverse_at < 0){
        reverse_at +=len;
    }
    
    reverseArray(a,0,len-1);
    reverseArray(a,0,reverse_at-1);
    reverseArray(a,reverse_at,len-1);
   
    
  }
  
public static void reverseArray(int[] a, int left,int right){
     while(left  <= right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        
        left++;
        right--;
    } 
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}