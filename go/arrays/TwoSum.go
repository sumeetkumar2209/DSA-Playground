package main

// Question : https://neetcode.io/problems/two-integer-sum/question

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)

	for i, num := range nums {
		val := target - num
		if value, ok := m[val]; ok {
			return []int{value, i}
		}
		m[num] = i
	}
	return []int{}
}
