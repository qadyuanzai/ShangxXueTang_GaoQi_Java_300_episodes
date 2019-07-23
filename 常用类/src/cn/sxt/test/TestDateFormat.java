package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮���ת��
 * DateFormat�������SimpleDateFormatʵ�����ʹ��
 * @author qadyuanzai
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//�����಻�ܱ�new��Ҫ��ʵ����
		//��ʽ�������ն���õĸ�ʽ����ת��
		Date d = new Date(40000000);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(d);	
		System.out.println(str);
		
		DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");
		String str2 = df2.format(d);
		System.out.println(str2);
		
		//���ַ������ա���ʽ�ַ�����ָ���ĸ�ʽ��ת����Ӧ��ʱ�����
		DateFormat df3 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		Date d1 = df3.parse("2019��7��24�� 00ʱ5��32��");
		System.out.println(d1.toString());
		
		//���������ַ���
		//"D" ��ʾ����������ݵĵڼ��� 
		DateFormat df4 = new SimpleDateFormat("D");
		String str4 = df4.format(new Date());
		System.out.println(str4);
		
	}
}
