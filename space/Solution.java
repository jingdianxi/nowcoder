package com.nowcoder.space;
/**
 * 替换空格
 * 实现一个函数，将一个字符串中的每个空格替换成%20
 */
public class Solution {
	public String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll("\\s", "%20");
	}
}
