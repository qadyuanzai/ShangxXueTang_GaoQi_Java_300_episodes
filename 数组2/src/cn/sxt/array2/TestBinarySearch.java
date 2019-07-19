package cn.sxt.array2;

import java.util.Arrays;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(myBinarySearch(arr, 11));
	}

	public static int myBinarySearch(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		int index = -1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] > value) {
				high = mid - 1;
			}else if(arr[mid] < value) {
				low = mid + 1;
			}else {
				index = mid;
				break;
			}
		}
		return index;
	}
}


