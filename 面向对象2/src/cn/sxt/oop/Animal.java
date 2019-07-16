package cn.sxt.oop;

//给子类提供模板，子类必须实现相关抽象方法
abstract public class Animal {
	//包含抽象方法类必须为抽象类
	
	//特点：
	//1：没有实现
	//2：子类必须实现
	abstract public void shut();
	
	public void run() {
		System.out.println("跑啊跑！");
	}
}

class Dog extends Animal{
	//必须实现
	public void shut() {
		System.out.println("汪汪汪");
	}
}