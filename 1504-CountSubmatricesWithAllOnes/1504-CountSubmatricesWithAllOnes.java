// Last updated: 8/30/2025, 12:43:34 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1] && nums[i]==0){
                count++;
            }
            else if(nums[i-1]==0){
                list.add(count);
                count=1;
            }
        }
        if(nums[n-1]==0){
            list.add(count);
        }
        long sum=0;
        for(int num:list){
            while(num>=1){
                sum+=num;
                num--;
            }
        }
        return sum;
    }
}