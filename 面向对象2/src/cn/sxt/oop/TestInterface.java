package cn.sxt.oop;

/**
 * 测试接口和实现类
 * @author qadyuanzai
 *
 */

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angle();
		//若为volant则只能调用volant内函数
		v.fly();

		//若为angle则可使用两个接口里的函数
		Angle a = new Angle();
		a.fly();
		a.helpOther();
	}
}

/**
 * 飞行接口
 * @author qadyuanzai
 *
 */
interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
	
}

interface Honest{
	void helpOther();
}

//接口可以多继承
interface A extends Volant, Honest{
	
}

class Angle implements Volant, Honest{	//可以实现多个父接口

	@Override
	public void helpOther() {
		System.out.println("Angle.helpOther()");		
	}

	@Override
	public void fly() {
		System.out.println("Angle.fly()");
	} 
}

class GoodMan implements Honest{

	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther()");
	}
	
}