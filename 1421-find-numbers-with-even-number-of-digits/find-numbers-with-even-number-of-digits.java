class Solution {
    public int findNumbers(int[] nums) {
        int cou  =0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int sum = 0;
            while(a>0){
                a=a/10;
                sum++;
            }
            if(sum%2==0){
                cou++;
            }
        }
        return cou;
    }
}