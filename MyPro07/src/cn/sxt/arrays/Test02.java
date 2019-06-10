package cn.sxt.arrays;
/**
 * 测试foreach
 * @author 张思源
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] a = new int[3];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		//foreach只可用于读取，不可写入
		for(int m : a) {
			System.out.println(m);
		}
		
	}
}
