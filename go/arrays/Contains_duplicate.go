package main

// Question : https://neetcode.io/problems/contains-duplicate/question

func hasDuplicate(nums []int) bool {
	mySet := make(map[int]bool)

	for _, num := range nums {
		if mySet[num] {
			return true
		}
		mySet[num] = true
	}
	return false
}
