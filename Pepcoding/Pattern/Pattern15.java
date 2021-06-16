/* 
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.
Input Format
A number n
Output Format
pat151
Question Video


Constraints
1 <= n <= 10
 Also, n is odd.
Sample Input
5
Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
	

*/
class Solution {
    public void printPattern(int n) {
      
       
        int star = 1;
        int space = n/2;
        int number = 1;
        for (int i = 1; i<= n; i++){
            
            int current = number;
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= star; k++){
                System.out.print(current+"\t");
                
                if (k <= star/2){
                   current++; 
                }
                else{
                    current--;
                }
           
                
                
            }
            
            System.out.println();
            if(i <= n/2){
                space--;
                star +=2;
                number++;
            }
            else{
                star -=2;
                space++;
                number--;
            }
        }

        
    }
}


class Pattern14{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

