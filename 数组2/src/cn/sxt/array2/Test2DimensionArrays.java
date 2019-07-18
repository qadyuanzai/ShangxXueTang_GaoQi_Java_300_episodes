package cn.sxt.array2;

public class Test2DimensionArrays {
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		int[][] a = new int[3][];
		
		a[0] = new int[]{20, 30};
		a[1] = new int[]{10, 15, 80};
		a[2] = new int[]{50, 60};
		
		System.out.println(a[1][1]);
		
		int[][] b = {
				{10, 20, 30},
				{40, 50},
				{60}
		};
		
		System.out.println(b[2][0]);
		
	}
}

class Car{
	
}