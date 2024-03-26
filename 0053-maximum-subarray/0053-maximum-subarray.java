// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int sum = 0;
//         for(int i = 0; i < nums.length-1;i++){
//             sum = sum + nums[i];
//             max = Math.max(max, sum);
//             if(sum < 0){
//                 sum = 0;
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}