package cn.sxt.array2;

import java.util.Arrays;

/**
 * ≤‚ ‘√∞≈›≈≈–Ú
 * @author qadyuanzai
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		for(int i = 0; i < values.length; i++) {
			boolean flag = true;
			
			for(int j = 0; j < values.length - 1 - i; j++) {
				//±»Ωœ¥Û–°£¨ªªÀ≥–Ú				
				if(values[j] > values[j+1]) {
					int temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					
					flag = false;
				}
			}
			if(flag) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(values));
		
	}
}
