package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar2 {
	public static void main(String[] args) throws ParseException {
		String str = "2019-7-27";
		//输入7月实际存入为6，所以输入按正常1-12月输入
		//周日为1，周六为7
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
		
		Calendar c = new GregorianCalendar();
		Calendar c1 = new GregorianCalendar();
		c.setTime(date);
		c1.setTime(date);
		c1.set(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int daysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int days = 1;
		for(int i = 1; days <= daysOfMonth; i++) {
			if(i == 1) {
				for(int j = 1; j < c1.get(Calendar.DAY_OF_WEEK); j++) {
					System.out.print("\t");
					i++;
				}	
			}
			System.out.print(days + "\t");
			days++;
			if(i%7==0) {
				System.out.println();
			}
		}
	}
}