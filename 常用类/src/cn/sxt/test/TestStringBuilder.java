package cn.sxt.test;

/**
 * ����StringBuilder��StringBuffer
 * @author qadyuanzai
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		//StringBuilder�̲߳���ȫ��Ч�ʸߣ�StringBuffer��֮ 
		StringBuilder sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
