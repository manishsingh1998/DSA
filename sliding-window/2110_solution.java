class Solution {
    public long getDescentPeriods(int[] nums) {

        long cur=0,tot=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]-nums[i]==1){
                cur++;
                tot+=cur;
            }
            else{
                cur=0;
            }
        }
        
        return tot+nums.length;
    }
}