// Last updated: 1/13/2026, 10:32:27 PM
1class Solution {
2    public double separateSquares(int[][] squares) {
3        double totalArea = 0;
4        double low = 2e9;
5        double high = 0;
6
7        for (int[] sq : squares) {
8            double y = sq[1];
9            double l = sq[2];
10            
11            totalArea += l * l;
12            
13            low = Math.min(low, y);
14            high = Math.max(high, y + l);
15        }
16
17        double halfArea = totalArea / 2.0;
18
19        
20        for (int i = 0; i < 100; i++) {
21            double mid = low + (high - low) / 2.0;
22            
23            if (calculateArea(squares, mid) >= halfArea) {
24                high = mid; 
25            } else {
26                low = mid; 
27            }
28        }
29        
30        return high;
31    }
32
33    private double calculateArea(int[][] squares, double currentY) {
34        double area = 0;
35        for (int[] sq : squares) {
36            double y = sq[1];
37            double l = sq[2];
38            double top = y + l;
39
40            if (y >= currentY) {
41                continue;
42            } else if (top <= currentY) {
43                area += l * l;
44            } else {
45                area += l * (currentY - y);
46            }
47        }
48        return area;
49    }
50}