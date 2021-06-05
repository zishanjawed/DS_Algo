
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int y = n;
        int  x =0;
        for (int i =0;i<n;i++){       
            result[x]=nums[i];
            x++;
            result[x]=nums[y];
            x++;
            y++;
            
        }
        return result;      
    }
}

class ShuffleTheArrayLeetcode{
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        // Test Cases
        int nums[] = {2,5,1,3,4,7};
        int n = 3;
        
        
        
        int result [] = obj.shuffle(nums,n);
        
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            System.out.print(' ');

        }

        
    }
}
