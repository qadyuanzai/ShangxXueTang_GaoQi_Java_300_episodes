package cn.sxt.oop;

/**
 * ���Խӿں�ʵ����
 * @author qadyuanzai
 *
 */

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angle();
		//��Ϊvolant��ֻ�ܵ���volant�ں���
		v.fly();

		//��Ϊangle���ʹ�������ӿ���ĺ���
		Angle a = new Angle();
		a.fly();
		a.helpOther();
	}
}

/**
 * ���нӿ�
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

//�ӿڿ��Զ�̳�
interface A extends Volant, Honest{
	
}

class Angle implements Volant, Honest{	//����ʵ�ֶ�����ӿ�

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