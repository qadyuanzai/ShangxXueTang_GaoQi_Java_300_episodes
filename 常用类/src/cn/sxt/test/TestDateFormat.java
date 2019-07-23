package cn.sxt.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的转化
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * @author qadyuanzai
 *
 */
public class TestDateFormat {
	public static void main(String[] args) {
		//抽象类不能被new，要用实现类
		//格式化，按照定义好的格式进行转化
		Date d = new Date(40000000);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(d);	
		System.out.println(str);
		
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String str2 = df2.format(d);
		System.out.println(str2);
	}
}
