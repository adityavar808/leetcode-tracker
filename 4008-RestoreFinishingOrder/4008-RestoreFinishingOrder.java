// Last updated: 9/4/2025, 12:18:15 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int index = 0;

        for(int o : order){
            for(int f : friends){
                if(o == f){
                    result[index++] = o;
                    break;
                }
            }
        }
        return result;
    }
}