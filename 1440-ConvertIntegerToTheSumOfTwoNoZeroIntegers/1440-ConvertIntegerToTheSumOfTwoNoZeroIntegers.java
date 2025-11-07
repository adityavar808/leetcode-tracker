// Last updated: 11/8/2025, 2:05:54 AM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for(int i = 1; i < n; i++){
            int a = i;
            int b = n - i;

            if(areBothValid(a, b) == true){
                arr[0] = a;
                arr[1] = b;
            }
        }
    return arr;
    }
    public static boolean checkZeroes(int a){
            while (a > 0) {
            if (a % 10 == 0) return false;
            a /= 10;
        }
        return true;
    }
    public static boolean areBothValid(int a, int b) {
        return checkZeroes(a) && checkZeroes(b);
    }
}