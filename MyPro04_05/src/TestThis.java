/**
 * This���÷�
 * @author ��˼Դ
 *
 */
public class TestThis {
	//static������this
	int a;
	int b;
	int c;
	
	TestThis(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c){
		this(a,b);//���ô��εĹ��췽�����ұ���λ�ڵ�һ�С�
		this.c = c;
	}
}
