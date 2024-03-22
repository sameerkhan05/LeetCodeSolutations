class Solution {
    public boolean canJump(int[] nums) {
        // initially the final postion is last index
        int finalPosition = nums.length-1;
        
        //start with the second last index 
        for(int i = nums.length-2;i>=0;i--){
            //if you can reach the final postion from this index 
            //update final index
            if(i+nums[i] >= finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}