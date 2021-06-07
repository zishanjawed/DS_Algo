
class Solution {
    public int[] runningSum(int[] nums) {
        
        
        for (int i = 1; i< nums.length; i++){
            nums[i] += nums[i-1];
            
        }
            
        return nums;
    }
}


class RunningSumOf1dArray{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases
        int nums[] = {1,2,3,4};
        
        
        int result [] = obj.runningSum(nums);
        
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            System.out.print(' ');

        }

        
    }
}