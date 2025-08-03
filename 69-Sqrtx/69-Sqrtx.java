// Last updated: 8/4/2025, 12:59:25 AM
class Solution {
  public int mySqrt(long x) {
    long l = 1;
    long r = x + 1;

    while (l < r) {
      final long m = (l + r) / 2;
      if (m > x / m)
        r = m;
      else
        l = m + 1;
    }

    // l := the minimum number s.t. l * l > x
    return (int) l - 1;
  }
}