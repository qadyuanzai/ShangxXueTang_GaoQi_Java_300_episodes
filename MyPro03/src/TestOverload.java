/**
 * ���Է�������
 * @author ��˼Դ
 *
 */
		
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(1,2));
		TestOverload to = new TestOverload();
		int m = to.multiply(2, 3);
		System.out.println(m);
	}
	
	public static int add(int a, int b) {
		//����static���Բ��ô�������ֱ�ӵ���
		return a + b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
}
