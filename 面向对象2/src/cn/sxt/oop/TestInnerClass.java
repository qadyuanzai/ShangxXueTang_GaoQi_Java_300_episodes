package cn.sxt.oop;

/**
 * ���ԷǾ�̬�ڲ���
 * @author qadyuanzai
 *
 */
public class TestInnerClass {
	public static void main(String[] args) {
		//�����ڲ������
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

class Outer{
	private int age = 10;
	public void testOut() {
		System.out.println("Outer.testOut()");
	}
	
	//�ڲ���
	class Inner{
		//�Ǿ�̬�ڲ��಻���о�̬��Ա
		//static int age = 10;
		
		
		//����ֱ�ӷ����ⲿ���Ա
		public void show() {
			System.out.println("�ⲿ��ĳ�Ա����age��"+Outer.this.age);
		}
	}
}
