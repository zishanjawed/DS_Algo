/* 
1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
                                  
                                 
                                
                               
Input Format
A number n
Output Format
pat161
Question Video


Constraints
1 <= n <= 10
Sample Input
7
Sample Output
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	


*/
class Solution {
    public void printPattern(int n) {
      
       
        int n = scn.nextInt();
        int space = 2*n -3;
        int star = 1;
        
        for (int i = 1; i <= n; i++){
            
            for (int j=1; j<=star;j++){
                System.out.print(j+"\t");
            }
            
            for(int j=1;j<=space;j++){
               System.out.print("\t"); 
            }
            
            for (int j=star; j>=1;j--){
                if(j == n){
                    j--;
                }
                System.out.print(j+"\t");
            }
            
            System.out.println();
          
           
           star++; 
           space -=2;
        }
        
    }
}


class Pattern16{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 20;
        
        
       obj.printPattern(n);

        
        
    }
}

