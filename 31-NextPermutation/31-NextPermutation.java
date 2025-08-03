// Last updated: 8/4/2025, 1:00:06 AM
class Solution {
    public void nextPermutation(int[] nums) {
        nextpermutation(nums);
    }
    public static void nextpermutation(int[] arr){
        int p = -1;
        int n = arr.length;
        for(int i = n -2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                p = i;
                break;
            }
        } 
        if( p == -1){
            Reverse(arr, 0 , n-1);
            return;
        }
        int q = -1;
        for(int i = n-1; i > p; i--){
            if(arr[i] > arr[p]){
                q = i;
                break;
            }
        }
        //swap p & q
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        Reverse(arr, p + 1, n - 1);
    }
    public static void Reverse(int[] arr,int i, int j) {
		// int i = 0;
		// int j = arr.length - 1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}