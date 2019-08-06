package cn.sxt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * ����HashMap��ʹ��
 * @author qadyuanzai
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");

		System.out.println(m1.get(1));
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("��"));
		
		Map<Integer, String> m2 = new HashMap<>();
		m2.put(4, "��");
		m2.put(5, "��");
		
		System.out.println(m1);
		m1.putAll(m2);
		System.out.println(m1);
		
		//map�м������ظ�������ظ������µĸ��Ǿɵ�(����equals�����ж�)
		m1.put(1, "һ");
		System.out.println(m1);
		
	}
}
