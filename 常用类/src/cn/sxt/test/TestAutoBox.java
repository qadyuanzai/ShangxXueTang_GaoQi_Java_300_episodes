package cn.sxt.test;

public class TestAutoBox {
	public static void main(String[] args) {
		Integer a = 234;
		//�Զ�װ��
		//������������:Integer a = Integer.valueOf(234);
		
		int b = a;
		//�Զ�����
		//������������:int b = a.intValue();
	}
}
