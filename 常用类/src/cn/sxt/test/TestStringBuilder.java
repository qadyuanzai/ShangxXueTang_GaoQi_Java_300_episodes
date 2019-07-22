package cn.sxt.test;

/**
 * 测试StringBuilder、StringBuffer
 * @author qadyuanzai
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		//StringBuilder线程不安全，效率高；StringBuffer反之 
		StringBuilder sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
