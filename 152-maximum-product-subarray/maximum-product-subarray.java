class Solution {
    public int maxProduct(int[] nums) {
        int sum = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum*=nums[i];
            max=Math.max(sum,max);
            if(sum==0){
                sum=1;
            }
        }
        sum = 1;
        for(int i=nums.length-1;i>=0;i--){
            sum*=nums[i];
            max=Math.max(sum,max);
            if(sum==0){
                sum=1;
            }
        }
        return max;        
    }
}