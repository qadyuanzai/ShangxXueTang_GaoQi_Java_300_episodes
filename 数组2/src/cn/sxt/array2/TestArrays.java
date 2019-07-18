package cn.sxt.array2;

import java.util.Arrays;
/**
 * 测试java.util.Arrays工具类的使用
 * @author qadyuanzai
 *
 */

public class TestArrays {
	public static void main(String[] args) {
		int[] a = {100, 20, 30, 50, 40, 80, 70};

		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 100));
	}
}
