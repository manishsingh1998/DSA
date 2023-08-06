class Solution {

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={2,3,0,0,5,6};
        long ans=s.zeroFilledSubarray(nums);
        System.out.println(ans);
    }
    
    public long zeroFilledSubarray(int[] nums) {
        long res=0,numSubarray=0;

        for(int n:nums){
            if(n==0)
                numSubarray++;
            else
                numSubarray=0;
            res+=numSubarray;
        }

        return res;
        
    }
}