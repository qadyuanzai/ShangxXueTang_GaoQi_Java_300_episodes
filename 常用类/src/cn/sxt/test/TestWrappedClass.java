package cn.sxt.test;

/**
 * 测试包装类
 * Integer类的使用
 * @author qadyuanzai
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转换成包装类对象
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		//把包装类对象转换成基本数据类型
		int c = b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类对象
		Integer e = new Integer("99999");
		Integer f = Integer.parseInt("999888");
		
		//把包装类对象转成字符串
		String str = f.toString();
		
		//常见的常量
		System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
		
		
	}
}
