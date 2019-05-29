/**
 * 字符串运算符
 * @author 张思源
 *
 */
public class TestOpreator02 {
	public static void main(String[] args) {
		String a = "3";
		int b = 4;
		int c = 5;
		char d = '5';
		System.out.println(a+b+c);
		System.out.println(b+c+a);
		System.out.println(d+4);//char会先换成什么什么码（int）再计算
	}
}
