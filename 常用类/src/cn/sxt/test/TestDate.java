package cn.sxt.test;

import java.util.Date;

/**
 * 测试Date类的常见用法
 * @author qadyuanzai
 *
 */
public class TestDate {
	public static void main(String[] args) {
		//2000毫秒
		Date d = new Date(2000);
		
		Date d2 = new Date();
		
		System.out.println(d2.getTime());
		
		System.out.println(d2.after(d));
	}
}
