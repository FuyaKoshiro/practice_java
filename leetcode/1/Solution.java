class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++) {
            for(int k=i+1; k<nums.length; k++) {
                if(nums[i]+nums[k]==target) {
                    int[] answer={i, k};
                    return answer;
                }
            }
        }
        int[] answer={};
        return answer;
    }
}