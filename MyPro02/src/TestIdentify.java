/**
 * 测试标识符的用法
 * @author 张思源
 *
 */
public class TestIdentify {
	public static void main(String[] args) {
		int a123 = 1;
		//int 123abc = 2; //数字不能开头
		int $a = 3;
		int _123 = 4;
		//int #abd = 5;
		
		int 汉字 = 6; //可以使用汉字，一般不建议
		
		//int class = 2; //关键字不能做标识符
	}
}
