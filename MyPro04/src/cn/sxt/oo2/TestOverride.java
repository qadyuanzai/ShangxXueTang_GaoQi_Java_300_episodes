package cn.sxt.oo2;

/**
 * 测试重写
 * @author 张思源
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
		System.out.println("跑……");
	}
	public void stop() {
		System.out.println("停止……");
	}
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("地对地导弹");
	}
	public Student whoIsPsg() {
		return new Student();//返回类型小于等于父类，CTRL+T看继承结构
	}
}
