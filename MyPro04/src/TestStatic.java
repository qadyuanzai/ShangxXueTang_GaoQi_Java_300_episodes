/**
 * 测试static
 * @author 张思源
 *
 */
public class TestStatic {
	/*
	 * static是属于类的，不是属于对象的，创建对象的时候就创建了
	 * 属于对象的要单独创建出一个对象后才存在
	 */
	int a;
	static int b;
	
	static void printa() {
		//System.out.println(a);//不能在静态方法里使用非静态成员
		printb();//调用静态方法也没有问题
	}
	static void printb() {
		System.out.println(b);
	}
}
