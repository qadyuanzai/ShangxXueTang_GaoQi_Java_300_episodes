package cn.sxt.oop;

public interface MyInterface {
	//变量默认添加 public static final
	int MAX_AGE = 100;
	
	//函数默认添加 public abstract
	void test01();
}

class MyClass implements MyInterface{

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		
	}
	
}