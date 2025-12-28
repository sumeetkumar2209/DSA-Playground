
# Question : https://neetcode.io/problems/is-anagram/question

class Solution:
    
    def isAnagram(self,  s:str, t: str) -> bool:
        m = {}

        for s1 in s:
            val = m.get(s1, 0) + 1
            m[s1] = val

        for s2 in t:
            val = m.get(s2, 0) - 1
            if val < 0 :
                return False
            elif val == 0 :
                del m[s2]
            else :
                m[s2] = val

        return len(m) == 0   

if __name__ == '__main__' :
    sol = Solution()
    print(sol.isAnagram("racecar", "carrace"))
    print(sol.isAnagram("jar", "jam"))

             
