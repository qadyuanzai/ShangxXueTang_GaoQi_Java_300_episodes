package cn.sxt.arrays;
/**
 * ����foreach
 * @author ��˼Դ
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] a = new int[3];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		//foreachֻ�����ڶ�ȡ������д��
		for(int m : a) {
			System.out.println(m);
		}
		
	}
}
