package cn.sxt.oo2;

/**
 * ������д
 * @author ��˼Դ
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("�ܡ���");
	}
	public void stop() {
		System.out.println("ֹͣ����");
	}
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("�ضԵص���");
	}
	public Student whoIsPsg() {
		return new Student();//��������С�ڵ��ڸ��࣬CTRL+T���̳нṹ
	}
}
