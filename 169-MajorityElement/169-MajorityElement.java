// Last updated: 8/4/2025, 12:58:35 AM
class Solution {
    public int majorityElement(int[] nums) {
        return moore_voting(nums);
    }
    public static int moore_voting(int[] arr) {
		int e = arr[0];
		int v = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == e) {
				v++;
			} else {
				v--;
				if (v == 0) {
					e = arr[i];
					v = 1;
				}
			}
		}
		return e;
	}
}