package cn.sxt.oop;

//�������ṩģ�壬�������ʵ����س��󷽷�
abstract public class Animal {
	//�������󷽷������Ϊ������
	
	//�ص㣺
	//1��û��ʵ��
	//2���������ʵ��
	abstract public void shut();
	
	public void run() {
		System.out.println("�ܰ��ܣ�");
	}
}

class Dog extends Animal{
	//����ʵ��
	public void shut() {
		System.out.println("������");
	}
}