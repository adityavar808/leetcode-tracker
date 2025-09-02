// Last updated: 9/2/2025, 10:34:54 PM
class Solution {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        
        while (area % W != 0) {
            W--;
        }
        
        int L = area / W;
        
        return new int[]{L, W};
    }
}