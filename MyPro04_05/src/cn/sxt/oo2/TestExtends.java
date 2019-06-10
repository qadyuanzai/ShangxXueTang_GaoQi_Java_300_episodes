package cn.sxt.oo2;

/**
 * 测试继承
 * @author 张思源
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
		System.out.println("休息一会！");
	}
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("学习两小时！");
	}
	
	public Student(int height, String name,String major) {
		this.height = height;
		this.name = name;
		this.major = major;
	}
	public Student() {
		
	}
}