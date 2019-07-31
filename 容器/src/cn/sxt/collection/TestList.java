package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ����Collection�ӿ��еķ���
 * @author qadyuanzai
 *
 */
public class TestList {
	public static void main(String[] args) {

		test02();
		
		
	}
	
	public static void test01() {
		Collection<String> c = new ArrayList<>();
		
		c.add("Percy");
		c.add("Percy2");
		
		Object[] objs = c.toArray();
		System.out.println(objs);
		
		System.out.println(c.contains("Percy"));
		
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		//removeֻ���Ƴ�������ɾ��
		c.remove("Percy2");
		System.out.println(c);
		c.clear();
	}
	
	public static void test02() {
		List<String> list01 = new ArrayList<String>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<String>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		
		System.out.println("list01:"+list01);
		
		//list01.addAll(list02);		//ȫ������
		//list01.removeAll(list02);		//�Ƴ�����
		//list01.retainAll(list02);		//��������
		
		System.out.println("list01:"+list01);
	}
	
	
}
