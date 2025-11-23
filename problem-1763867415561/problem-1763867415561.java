// Last updated: 11/23/2025, 8:40:15 AM
class Solution {
    public long sumAndMultiply(int n) {
        String x = String.valueOf(n).replace("0","");
       if(x.isEmpty()) return 0;
        int sum = 0;
        
        for(int i = 0; i < x.length(); i++){
            sum += x.charAt(i) - '0';
        }

        long finalNum = Long.parseLong(x);
        return finalNum * sum;
        
    }
}