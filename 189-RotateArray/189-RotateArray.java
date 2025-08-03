// Last updated: 8/4/2025, 12:58:32 AM
class Solution {
    public void rotate(int[] nums, int k) {
        rotateArray(nums, k);
    }
    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
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
}