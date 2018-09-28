package com.nowcoder.tree;

import java.util.Arrays;

/**
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字
 */
public class Solution {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0 || in.length == 0){
			return null;
		}
		TreeNode node = new TreeNode(pre[0]);
		for (int i = 0; i < in.length; i++) {
			if (pre[0] == in[i]) {
				node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
				node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
			}
		}
		return node;
	}
}
