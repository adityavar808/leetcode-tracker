// Last updated: 9/4/2025, 12:18:13 PM
class Solution {

    public List<Integer> best;
    public int bestDiff = Integer.MAX_VALUE;
    
    public int[] minDifference(int n, int k) {

        best = null;
        backtrack(n, k, 1, new ArrayList<>());

        int[] res = new int[k];
        for (int i=0; i<k; i++) res[i] = best.get(i);

        return res;
        
    }

    public void backtrack(int n, int k, int st, List<Integer> curr){
        if (k==1){
            if (n >= st){
                curr.add(n);
                check(curr);
                curr.remove(curr.size()-1);
            }

            return ;
        }

        for (int i=st; i<=n; i++){
            if (n%i == 0){
                curr.add(i);
                backtrack(n/i, k-1, i, curr);
                curr.remove(curr.size()-1);
            }
        }
    }

    public void check(List<Integer> curr){
        int min = Collections.min(curr);
        int max = Collections.max(curr);

        if (max-min < bestDiff){
            bestDiff = max-min;
            best = new ArrayList<>(curr);
        }
    }
}