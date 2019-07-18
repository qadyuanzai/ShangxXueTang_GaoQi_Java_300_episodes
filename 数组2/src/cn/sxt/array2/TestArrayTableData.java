package cn.sxt.array2;

import java.util.Arrays;

public class TestArrayTableData {
	public static void main(String[] args) {
		Object[] a0 = {1000, "Percy0", 18, "╟Кои"};
		Object[] a1 = {1001, "Percy1", 19, "╟Кои"};
		Object[] a2 = {1002, "Percy2", 20, "╟Кои"};
		
		Object[][] tableData = new Object[3][];
		tableData[0] = a0;
		tableData[1] = a1;
		tableData[2] = a2;
		
		for(Object[] temp : tableData) {
			System.out.println(Arrays.toString(temp));
		}
	}
}
