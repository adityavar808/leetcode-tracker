// Last updated: 10/12/2025, 8:56:04 AM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        for(int x : nums){
            f.put(x,f.getOrDefault(x, 0) + 1);
        }
        int s = 0;
        for(int x : nums){
            if(f.get(x) % k == 0){
                s += x;
            }
        }
        return s;
    }
}