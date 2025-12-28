
# Question : https://neetcode.io/problems/two-integer-sum/question

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}

        for i, num in enumerate(nums):
            val = target - num
            if val in m:
                return [m[val], i]
            m[num] = i
        return []
    
if __name__ == "__main__":    
    sol = Solution()
    print(sol.twoSum([2,7,11,15], 9))  # Output: [0, 1]
    print(sol.twoSum([3,2,4], 6))      # Output: [1, 2]
    print(sol.twoSum([3,3], 6))        # Output: [0, 1]