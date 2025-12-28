package main

import "fmt"

func main() {
	question := "validAnagram"

	switch question {
	case "twosum":
		nums := []int{2, 7, 11, 15}
		target := 9
		result := twoSum(nums, target)
		fmt.Println("Two Sum Result:", result)
	case "containsduplicate":
		nums := []int{1, 2, 3, 1}
		result := hasDuplicate(nums)
		fmt.Println("Contains Duplicate Result:", result)
	case "validAnagram":
		result := isValidAnagram("car", "jar")
		fmt.Println(result)
	default:
		fmt.Println("Question not found")
	}
}
