package main

// https://neetcode.io/problems/is-anagram/question

func isValidAnagram(s string, t string) bool {

	m := make(map[rune]int)

	for _, str := range s {
		val := m[str] + 1
		m[str] = val
	}

	for _, str := range t {
		val := m[str] - 1
		if val < 0 {
			return false
		} else if val == 0 {
			delete(m, str)
		} else {
			m[str] = val
		}
	}

	return len(m) == 0
}
