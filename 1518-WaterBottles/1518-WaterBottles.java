// Last updated: 10/1/2025, 2:01:42 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int eb = 0;
        
        while (numBottles > 0) {
            drinked += numBottles;
            eb += numBottles;
            
            numBottles = eb / numExchange;
            eb = eb % numExchange;
        }
        return drinked;
    }
}