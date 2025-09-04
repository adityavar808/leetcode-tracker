// Last updated: 9/4/2025, 12:18:19 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int firstArrive = Math.abs(z-x);
        int secondArrive = Math.abs(z-y);
        if(firstArrive > secondArrive){
            return 2;
        }
        else if(firstArrive < secondArrive){
            return 1;
        }
        else{
            return 0;
        }
    }
}