package cn.sxt.array2;

import java.util.Arrays;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
		int value = 10;
		
		int low = 0;
		int high = arr.length - 1;
		Arrays.sort(arr);
		
		while(low<high) {
			int mid = (low + high) / 2;
			if(arr[mid] > value) {
				high = mid;
			}else if(arr[mid] < value) {
				low = mid;
			}else {
				
			}
			
		}
		
		
		
	}
}
