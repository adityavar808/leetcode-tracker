// Last updated: 9/7/2025, 5:11:37 PM
class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1 << n; 
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}