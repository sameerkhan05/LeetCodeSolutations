class Solution {
    public int singleNumber(int[] nums) {
        int tgt = 0;
        for(int i=0; i < nums.length;i++){
            tgt ^= nums[i];
        }
        return tgt;
    }
}