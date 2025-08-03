// Last updated: 8/4/2025, 12:59:41 AM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         Map<Integer, Integer> hm = new TreeMap<>();


        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];

           if (!hm.containsKey(a)){
                hm.put(a,b);
            }else {
                if (hm.get(a) < b ){
                    hm.put(a,b);
                }
            }

        }

         if (!hm.containsKey(newInterval[0])){
                hm.put(newInterval[0],newInterval[1]);
            }else {
                if (hm.get(newInterval[0]) < newInterval[1] ){
                    hm.put(newInterval[0],newInterval[1]);
                }
            }
 


        int ans[][] = new int[hm.size()][2];
        int l = 0;

        for (Integer k : hm.keySet()) {
            int a = ans[l][0] = k;
            int b = ans[l][1] = hm.get(k);
            l++;
        }

        // ans array is sorted now


        for (int i = 0; i < ans.length -1 ; i++) {

            int a = ans[i][0];
            int b = ans[i][1];


            int c = ans[i+1][0];
            int d = ans[i+1][1];
            if (b >= d ){
                ans[i][1] = -1 ;
                ans[i+1][1] = b ;
            }

            if (b >= c ){
                ans[i][1] = -1 ;
                ans[i+1][0] = -1 ;
            }

        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < ans.length; i++) {
            
            int a = ans[i][0];
            int b = ans[i][1];

            if (a != -1 ) arrayList.add(a);
            if (b != -1 ) arrayList.add(b);

        }


        int res[][] = new int[arrayList.size()/2][2];

        int c = 0 ;
        for (int i = 0; i < res.length; i++) {
            res[i][0] = arrayList.get(c) ;
            c++;
            res[i][1] = arrayList.get(c) ;
            c++;
        }

        return res;
    }
}