package com.nowcoder.jumpfloor;
/**
 * 跳台阶问题
 */
public class Solution {
	/**
	 * 一次可以跳上1至2级台阶，求跳上n级台阶的方法数
	 * 递归
	 * @param target
	 * @return
	 */
	public int jumpFloor(int target) {
		if (target < 1) {
			return 0;
		} else if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			return jumpFloor(target - 1) + jumpFloor(target - 2);
		}
	}
	/**
	 * 一次可以跳上1至2级台阶，求跳上n级台阶的方法数
	 * 迭代
	 * @param target
	 * @return
	 */
	public int jumpFloorIter(int target) {
		if (target == 1 || target == 2) {
			return target;
		}
		// n阶方法数=(n-1)阶方法数+(n-2)阶方法数
		// n阶方法数
		int jumpSum = 0;
		// (n-1)阶方法数
		int jumpSumBackStep1 = 2;
		// (n-2)阶方法数
		int jumpSumBackStep2 = 1;
		for (int i = 3; i <= target; i++) {
			jumpSum = jumpSumBackStep1 + jumpSumBackStep2;
			jumpSumBackStep2 = jumpSumBackStep1;
			jumpSumBackStep1 = jumpSum;
		}
		return jumpSum;
	}
	/**
	 * 一次可以跳上1至n级台阶，求跳上n级台阶的方法数
	 * 递归
	 * @param target
	 * @return
	 */
	public int jumpFloorPlus(int target) {
		if (target < 1) {
			return 0;
		} else if (target == 1) {
			return 1;
		} else {
			return 2 * jumpFloorPlus(target - 1);
		}
	}
	/**
	 * 一次可以跳上1至n级台阶，求跳上n级台阶的方法数
	 * 迭代
	 * @param target
	 * @return
	 */
	public int jumpFloorPlusIter(int target) {
		if (target < 1) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		int jumpSumBackStep = 1;
		int jumpSum = 2;
		for (int i = 2; i <= target; i++) {
			jumpSum = 2 * jumpSumBackStep;
			jumpSumBackStep = jumpSum;
		}
		return jumpSum;
	}
}