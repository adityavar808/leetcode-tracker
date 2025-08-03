# Last updated: 8/4/2025, 1:00:47 AM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numbers_list = nums
        sum_number = target

        for i in range(len(numbers_list)):
            for j in range(len(numbers_list)):
                if i == j:
                    continue
                a = numbers_list[i] + numbers_list[j]
                if a == sum_number:
                    return [i,j]