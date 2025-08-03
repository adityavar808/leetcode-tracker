# Last updated: 8/4/2025, 1:00:35 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x_str = str(x)
        x_rev = x_str[::-1]
        if x_str == x_rev:
            return True
        else:
            return False