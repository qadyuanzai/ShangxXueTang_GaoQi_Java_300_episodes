package cn.sxt.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10,50);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month);//0-11表示月份，0是一月，11是12月
		System.out.println(weekday);//1-7表示星期，1是星期日，7是星期六
		System.out.println(day);
		
		System.out.println("##########################");
		
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8102);
		c2.add(Calendar.DATE, 100);//往后一百天
		
		System.out.println(c2);
		
		System.out.println("##########################");
		
		//日期对象和事件对象转换
		Date d = c2.getTime();
		System.out.println(d);
		
		Calendar c4 = new GregorianCalendar();
		c4.setTime(d);
		
		
	}
	
	public static void printCalendar(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		
	}
}




