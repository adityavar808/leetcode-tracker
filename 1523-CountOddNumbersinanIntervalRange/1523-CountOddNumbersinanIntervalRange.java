// Last updated: 12/7/2025, 1:50:41 PM
1class Solution {
2    public int countOdds(int low, int high) {
3        int count = 0;
4        for(long i = low; i <= high; i++){
5            if((i & 1) == 1){
6                count++;
7            }
8        }
9        return count;
10    }
11}