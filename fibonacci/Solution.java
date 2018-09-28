package com.nowcoder.fibonacci;
/**
 * 斐波那契数列
 * 输入一个整数n，输出斐波那契数列的第n项（从0开始，第0项为0）
 */
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
