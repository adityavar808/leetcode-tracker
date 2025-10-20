// Last updated: 10/20/2025, 10:39:15 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations)
            x += 44 - op.charAt(1);        
        return x;
    }
}
