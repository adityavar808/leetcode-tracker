// Last updated: 11/23/2025, 2:51:50 PM
class Solution {
    public int maxSumDivThree(int[] nums) {

        int sum = 0;

        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for (int n : nums) {
            sum += n;

            if (n % 3 == 1) r1.add(n);
            else if (n % 3 == 2) r2.add(n);
        }

        Collections.sort(r1);
        Collections.sort(r2);

        int rem = sum % 3;

        if (rem == 0) return sum;

        int option1 = Integer.MAX_VALUE;
        int option2 = Integer.MAX_VALUE;

        if (rem == 1) {
            if (r1.size() >= 1) option1 = r1.get(0);
            if (r2.size() >= 2) option2 = r2.get(0) + r2.get(1);
        } else { 
            if (r2.size() >= 1) option1 = r2.get(0);
            if (r1.size() >= 2) option2 = r1.get(0) + r1.get(1);
        }

        int best = sum - Math.min(option1, option2);
        return Math.max(best, 0);
    }
}
