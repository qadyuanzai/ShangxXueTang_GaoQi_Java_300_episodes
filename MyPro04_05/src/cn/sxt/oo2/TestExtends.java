package cn.sxt.oo2;

/**
 * ���Լ̳�
 * @author ��˼Դ
 *
 */

public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student(100,"Percy", "Chinese");
		stu.rest();
	}
}

class Person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("��Ϣһ�ᣡ");
	}
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("ѧϰ��Сʱ��");
	}
	
	public Student(int height, String name,String major) {
		this.height = height;
		this.name = name;
		this.major = major;
	}
	public Student() {
		
	}
}