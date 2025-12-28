from typing import List

# Question : https://neetcode.io/problems/contains-duplicate/question

class Solution:

    # Approach 1: TC: O(n), SC: O(n)
    def hasDuplicate_A1(self, nums: List[int]) -> bool:
        mySet = set()
        for num in nums:
            if num in mySet:
                return True
            mySet.add(num)
        return False

    # Approach 2: TC: O(n), SC: O(n)
    def hasDuplicate_A2(self, nums: List[int]) -> bool:
        mySet = set()
        for num in nums:
            mySet.add(num)
        if len(mySet) != len(nums):
            return True
        return False  
    
if __name__ == "__main__":
    sol = Solution()
    print(sol.hasDuplicate_A1([1, 2, 3, 1]))  # True
    print(sol.hasDuplicate_A2([1, 2, 3, 4]))  # False   