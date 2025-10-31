// Last updated: 10/31/2025, 2:16:10 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (numbers.contains(nums[i])) continue;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 2) {
                numbers.add(nums[i]);
            }
        }
        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}
