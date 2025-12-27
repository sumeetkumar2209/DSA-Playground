package main

import "fmt"

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

func main() {
	nums1 := []int{1, 2, 3, 4}
	nums2 := []int{1, 2, 3, 1}

	fmt.Println(hasDuplicate(nums1)) // false
	fmt.Println(hasDuplicate(nums2)) // true
}
