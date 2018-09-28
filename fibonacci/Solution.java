package com.nowcoder.fibonacci;

public class Solution {
	public int fibonacci(int n) {
		int i = 1;
		int j = 1;
		if (n < 1) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		while (n-- > 2) {
			i += j;
			j = i - j;
		}
		return i;
	}
}
