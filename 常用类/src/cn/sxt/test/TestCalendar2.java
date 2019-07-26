package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar2 {
	public static void main(String[] args) throws ParseException {
		String str = "2020-10-10";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
		
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		
		
	}
}
