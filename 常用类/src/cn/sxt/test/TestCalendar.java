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
		System.out.println(month);//0-11��ʾ�·ݣ�0��һ�£�11��12��
		System.out.println(weekday);//1-7��ʾ���ڣ�1�������գ�7��������
		System.out.println(day);
		
		System.out.println("##########################");
		
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8102);
		c2.add(Calendar.DATE, 100);//����һ����
		
		System.out.println(c2);
		
		System.out.println("##########################");
		
		//���ڶ�����¼�����ת��
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




