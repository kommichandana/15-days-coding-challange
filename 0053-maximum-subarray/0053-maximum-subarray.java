class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=nums[0];
        for(int j=0;j<nums.length;j++)
        {
           if(currentSum<0)
           {
            currentSum=0;
           }
           currentSum=currentSum+nums[j];
           maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}