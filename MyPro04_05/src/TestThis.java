/**
 * This的用法
 * @author 张思源
 *
 */
public class TestThis {
	//static不能用this
	int a;
	int b;
	int c;
	
	TestThis(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c){
		this(a,b);//调用带参的构造方法，且必须位于第一行。
		this.c = c;
	}
}
