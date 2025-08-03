// Last updated: 8/4/2025, 12:57:23 AM
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(isSortArray(nums) == true){
            return true;
        }
        int step = checkStepIndex(nums);
        rotate(nums, n - step);
        if(isSortArray(nums) == true){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isSortArray(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void rotate(int[] arr, int step){
        int n = arr.length;
        step = step % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, step-1);
        reverse(arr, step, n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static int checkStepIndex(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}