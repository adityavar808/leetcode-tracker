// Last updated: 11/8/2025, 2:05:56 AM
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int start = 0;
        int end = n-1;
        int val = n/2;
        while(start <= end){
            arr[start] = -val;
            arr[end] = val;
            start++;
            end--;
            val--;
        }
    return arr;
    }
}