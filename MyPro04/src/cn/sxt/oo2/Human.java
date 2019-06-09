package cn.sxt.oo2;

public class Human{
	private int age;//仅自己类可使用，子类也不行
	String name;
	protected int height;
	
	void sayAge() {
		System.out.println(age);
	}
}
