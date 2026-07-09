class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r =nums.length-1;
        while (l<=r){
            int  n=(l+(r))/2;
            if( target==nums[n]){
                return n;
            }
            else if ( target>nums[n]){
                l=n+1;
            }
            else {
                r=n-1;
            }
        }

        return -1;
    }
}