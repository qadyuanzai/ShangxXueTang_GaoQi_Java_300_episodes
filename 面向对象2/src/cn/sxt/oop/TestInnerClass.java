package cn.sxt.oop;

/**
 * 测试非静态内部类
 * @author qadyuanzai
 *
 */
public class TestInnerClass {
	public static void main(String[] args) {
		//创建内部类对象
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

class Outer{
	private int age = 10;
	public void testOut() {
		System.out.println("Outer.testOut()");
	}
	
	//内部类
	class Inner{
		//非静态内部类不能有静态成员
		//static int age = 10;
		
		
		//可以直接访问外部类成员
		public void show() {
			System.out.println("外部类的成员变量age："+Outer.this.age);
		}
	}
}
