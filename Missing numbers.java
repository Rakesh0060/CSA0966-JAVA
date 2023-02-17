class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans ^= nums[i] ^ (i+1);
        }
        return ans;
    }
