class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}