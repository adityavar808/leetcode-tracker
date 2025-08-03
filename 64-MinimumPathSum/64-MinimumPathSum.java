// Last updated: 8/4/2025, 12:59:31 AM
class Solution {
    HashMap<String,Integer> dp = new HashMap<>();
    public int minPathSum(int[][] grid) {
        return costOfPath2(grid,0,0);
    }
    private int costOfPath2(int[][] arr, int row, int col) {
        if(row==arr.length-1 && col==arr[0].length-1){
            return arr[row][col];
        }
        String key = row+"|"+col;
        if(dp.containsKey(key)){
              return dp.get(key);
          }
        if(row==arr.length-1){
          return costOfPath2(arr,row,col+1)+arr[row][col];
        }
        if(col==arr[0].length-1){
           return costOfPath2(arr,row+1,col)+arr[row][col];
        }
           int right = costOfPath2(arr,row,col+1)+arr[row][col];
           int bottom = costOfPath2(arr,row+1,col)+arr[row][col];
           int value = Math.min(right,bottom);
           dp.put(key,value);
           return value;
    }
}