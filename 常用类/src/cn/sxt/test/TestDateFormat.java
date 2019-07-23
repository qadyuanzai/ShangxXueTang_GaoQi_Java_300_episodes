package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的转化
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * @author qadyuanzai
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//抽象类不能被new，要用实现类
		//格式化，按照定义好的格式进行转化
		Date d = new Date(40000000);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(d);	
		System.out.println(str);
		
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String str2 = df2.format(d);
		System.out.println(str2);
		
		//把字符串按照“格式字符串”指定的格式，转成相应的时间对象
		DateFormat df3 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		Date d1 = df3.parse("2019年7月24日 00时5分32秒");
		System.out.println(d1.toString());
		
		//测试其他字符串
		//"D" 表示这是所处年份的第几天 
		DateFormat df4 = new SimpleDateFormat("D");
		String str4 = df4.format(new Date());
		System.out.println(str4);
		
	}
}
