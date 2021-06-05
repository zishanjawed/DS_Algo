
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxAmount = 0;
        
        for (int persion = 0; persion < accounts.length; persion++){
            int currentSum = 0;
            for (int bank= 0; bank < accounts[persion].length; bank++){
                currentSum += accounts[persion][bank];
            }
            
            if (currentSum >= maxAmount){
                maxAmount = currentSum;
            }
            currentSum = 0;
        }
        
        return maxAmount;
    }
}


class RichestCustomerWealth{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases
        int nums[][] = {
                        {1,2,3},
                        {3,2,1}
                     };
                        
          
        int result  = obj.maximumWealth(nums);
        System.out.print(result);
        

        
    }
}