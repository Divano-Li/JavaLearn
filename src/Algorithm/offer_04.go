package main

import "fmt"

func main() {
	a := [][]int{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}
	fmt.Print(findNumberIn2DArray(a, 20))
}

// 从第一行的最右侧寻找前一位和下一位， 前一位肯定比它小， 下一位肯定比他大
// 时间复杂度O（row + col), 空间复杂度O(1)
//
func findNumberIn2DArray(matrix [][]int, target int) bool {
	row := len(matrix)
	if row == 0 {
		return false
	}
	col := len(matrix[0])
	if col == 0 {
		return false
	}
	for i, j := 0, col-1; i < row && j >= 0; {
		if matrix[i][j] > target {
			j = j - 1
		} else if matrix[i][j] < target {
			i = i + 1
		} else {
			return true
		}
	}
	return false
}
