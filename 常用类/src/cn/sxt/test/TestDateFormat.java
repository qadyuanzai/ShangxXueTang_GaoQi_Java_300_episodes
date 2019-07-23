package cn.sxt.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮���ת��
 * DateFormat�������SimpleDateFormatʵ�����ʹ��
 * @author qadyuanzai
 *
 */
public class TestDateFormat {
	public static void main(String[] args) {
		//�����಻�ܱ�new��Ҫ��ʵ����
		//��ʽ�������ն���õĸ�ʽ����ת��
		Date d = new Date(40000000);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(d);	
		System.out.println(str);
		
		DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");
		String str2 = df2.format(d);
		System.out.println(str2);
	}
}
