

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
    public int getSumOfTwoArrays(int[5] arr1, int [5] arr2) {
      
        int max_size;
    
    // = (n1.length>n2.length)?n1.length:n2.length;
    
    if(arr1.length>arr2.length){
       max_size= arr1.length;
    }else{
       max_size= arr2.length; 
    }
    
    int[] resultArray = new int[max_size+1];
    int carry =0;
    
    int p1 = arr1.length-1;
    int p2 = arr2.length-1;
    int p3 = max_size;
    
    for(int i=max_size; i>0; i--){
        int a = 0;
        int b = 0;
        if ( p1 < arr1.length && p1 >=0 ){
             a = arr1[p1];
        }
        if (p2 < arr2.length && p2 >=0){
            b = arr2[p2];
        }
        
       
        // b = arr2[p2];
        int s = a + b + carry;
        
        resultArray[p3]= s % 10;
        carry = s/10;
        
        p1--;
        p2--;
        p3--;
        
    }
    
   
    
     
        return resultArray;
    }


}

class SumOfTwoArrays{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n1 = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i< n1; i++){
            arr1[i]= scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i< n2; i++){
            arr2[i]= scn.nextInt();
        }
        
       int[6] result = obj.getSumOfTwoArrays(arr1,arr2);
       for (int i =0 ; i<= 6; i++){
        if(i==0 && resultArray[i]== 0){}
        else{
          System.out.println(resultArray[i]);  
        }
       
   }
        
        
    }
}

