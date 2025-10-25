// Last updated: 10/25/2025, 4:08:04 PM
class Solution {
    int triSum(int n){
        return (n * (n + 1)) >> 1;
    }
    public int totalMoney(int n) {
        int nWeeks = n / 7;
        int rDays = n % 7;

        return triSum(n) - 42 * triSum(nWeeks - 1) - 6 * nWeeks * rDays;
    }
}