package cn.sxt.test;

public class TestAutoBox {
	public static void main(String[] args) {
		Integer a = 234;
		//自动装箱
		//编译器做的是:Integer a = Integer.valueOf(234);
		
		int b = a;
		//自动拆箱
		//编译器做的是:int b = a.intValue();
	}
}
