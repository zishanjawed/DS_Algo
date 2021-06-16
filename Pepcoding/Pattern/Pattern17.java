/* 
1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
                                  
                                 
                                
                               
                               
                               
Input Format
A number n
Output Format
pat181
Question Video


Constraints
1 <= n <= 10
 Also, n is odd.
Sample Input
7
Sample Output
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	


*/
class Solution {
    public void printPattern(int n) {
      
       
        int star = n;
     int space = 0;
     
     for (int i = 1; i<=n; i++){
         
         for(int j = 1; j<=space;j++){
            System.out.print("\t"); 
         }
         
         for(int j=1;j<=star;j++){
             if (i > 1 && i<=n/2 && j >1 && j <star){
                 System.out.print("\t");
             }
             else{
                System.out.print("*\t"); 
             }
            
             
         }
         
         if(i > n/2){
             space--;
             star +=2;
         }else{
             space++;
             star -=2;
         }
         System.out.println();
         
     }
}


class Pattern16{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

